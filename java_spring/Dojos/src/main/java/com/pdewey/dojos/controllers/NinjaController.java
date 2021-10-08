package com.pdewey.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.pdewey.dojos.models.Dojo;
import com.pdewey.dojos.models.Ninja;
import com.pdewey.dojos.services.DojoService;
import com.pdewey.dojos.services.NinjaService;

@Controller
public class NinjaController {
	

	// ********** Auto Add Repository Deps *****
	
	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;
	
	
	// ========== Display Routes =============== //
	
	// ********** Add View *********************
	
	@GetMapping( "/ninjas/add" )
	public String add( @ModelAttribute( "ninja" ) Ninja ninja, Model model ) {
		
		List<Dojo> dojos = dojoService.findAll();
		
		model.addAttribute( "dojos", dojos );
		
		return "ninjas/add.jsp";
	}
	

	// ********** Edit View ********************
	
	@GetMapping( "/ninjas/edit/{id}" )
	public String edit( @PathVariable( "id" ) Long id, Model model ) {
		
		List<Dojo> dojos = dojoService.findAll();
		
		model.addAttribute( "ninja", ninjaService.findOne( id ) );
		
		model.addAttribute( "dojos", dojos );
		
		
		return "ninjas/edit.jsp";
	}
	
	// ********** Details View *****************
	
	@GetMapping( "ninjas/view/{id}" )
	public String view( @PathVariable( "id" ) Long id, Model model ) {
		
		Ninja ninja = ninjaService.findOne( id );
		
		model.addAttribute( "ninja", ninja );
		
		return "ninjas/details.jsp";
	}
	
	
	// ========== Action Routes ================ //

	// ********** Create ***********************
	
	@PostMapping( "/ninjas/create" )
	public String create( @Valid @ModelAttribute( "ninja" ) Ninja ninja, BindingResult result, Model model ) {
		
		if ( result.hasErrors() ) {
			
			List<Dojo> dojos = dojoService.findAll();
			
			model.addAttribute( "dojos", dojos );
			
			return "ninjas/add.jsp";
		}
		
		else {
			
			ninjaService.save( ninja );
			
			return "redirect:/";
		}
	}
	
	// ********** Update ***********************
	
	@PutMapping( "/ninjas/edit/{id}" )
	public String update( @Valid @ModelAttribute( "ninja" ) Ninja ninja, BindingResult result, Model model ) {
		
		if ( result.hasErrors() ) {
			
			List<Dojo> dojos = dojoService.findAll();
			
			model.addAttribute( "dojos", dojos );
			
			return "ninjas/edit.jsp";
		}
		
		else {
			
			ninjaService.save( ninja );
			
			return "redirect:/dojos/view/" + ninja.getDojo().getId();
		}
	}
	
	// ********** Delete ***********************
	
	@GetMapping( "/ninjas/delete/{id}" )
	public String delete( @PathVariable( "id" ) Long id ) {
		
		ninjaService.delete( id );
		
		return "redirect:/";
	}
	
}
