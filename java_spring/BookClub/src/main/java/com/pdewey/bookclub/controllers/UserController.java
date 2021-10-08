package com.pdewey.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pdewey.bookclub.models.LoginUser;
import com.pdewey.bookclub.models.User;
import com.pdewey.bookclub.services.UserService;

@Controller
public class UserController {
	
	// ********** Auto Add Repository Deps *****

	@Autowired
	private UserService userService;
	
	// ========== Display Routes =============== //
	
	// ********** Index ************************
	
	@GetMapping( "/" )
	public String index( Model model ) {
		
		model.addAttribute( "newUser", new User() );
		model.addAttribute( "newLogin", new LoginUser() );
		
		return "users/index.jsp";
	}
	
	// ********** Dashboard ********************
	
	@GetMapping( "/home" )
	public String dashboard(Model model, HttpSession session ) {
		
		return "users/dashboard.jsp";
	}
	

	// ********** Create ***********************
	
	@PostMapping( "/users/register" )
	public String register( 
			@Valid @ModelAttribute( "newUser" ) User newUser,
			BindingResult result,
			Model model,
			HttpSession session
			) {
		
		userService.register( newUser, result );
		
		if ( result.hasErrors() ) {
			
			model.addAttribute( "newLogin", new LoginUser() );
			
			return "users/index.jsp";
		}
		
		session.setAttribute( "user_id" , newUser.getId() );
		
		return "redirect:/home";
	}
	
	// ********** Login ************************
	
	@PostMapping( "/users/login" )
	public String login( 
			@Valid @ModelAttribute( "newLogin" ) LoginUser newLogin,
			BindingResult result,
			Model model,
			HttpSession session
			) {
		
		User user = userService.login( newLogin , result );
		
		if ( result.hasErrors() ) {
			
			model.addAttribute( "newUser" , new User() );
			
			return "users/index.jsp";
		}
		
		session.setAttribute( "user_id" , user.getId() );
		
		return "redirect:/home";
	}
	
	// ********** Logout ***********************
	
	@GetMapping( "/users/logout" )
	public String logout( HttpSession session ) {
		
		session.removeAttribute("user_id");
		
		return "redirect:/";
	}
	
}
