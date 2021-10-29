package com.pdewey.controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pdewey.models.Project;
import com.pdewey.models.User;
import com.pdewey.services.ProjectService;
import com.pdewey.services.UserService;


@Controller
public class ProjectController {
	
	// ********** Auto Add Repository Deps *****

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private UserService userService;
	
	// ========== Display Routes =============== //
	
	// ********** Add View *********************
	
	@GetMapping( "/projects/new" )
	public String add( @ModelAttribute( "newProject" ) Project project, Model model, HttpSession session ) {
		
		User user = userService.getUser( (Long) session.getAttribute("user_id") );
		
		model.addAttribute( "user", user );
		
		return "projects/add.jsp";
	}
	
	// ========== Action Routes ================ //

	// ********** Create ***********************
	
	@PostMapping( "/projects/new" )
	public String create( @Valid @ModelAttribute( "newProject") Project project, BindingResult result, Model model, HttpSession session, 
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dueDate ) {
		
		if ( result.hasErrors() ) {
			
			User user = userService.getUser( (Long) session.getAttribute("user_id") );
			
			model.addAttribute( "user", user );
			
			return "projects/add.jsp";
		}
		
		else {
			projectService.save( project );
			
			projectService.addProjectToUser( project.getId(), (Long) session.getAttribute("user_id"));
			
			return "redirect:/home";
		}
		
	}
}
