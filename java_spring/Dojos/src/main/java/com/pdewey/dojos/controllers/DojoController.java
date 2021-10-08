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
import com.pdewey.dojos.services.DojoService;

@Controller
public class DojoController {
	
	// ********** Auto Add Repository Deps *****
	
	@Autowired
	private DojoService dojoService;
	
	// ========== Display Routes =============== //
	
	// ********** Index ************************
	
	@GetMapping( "/" )
	public String index() {
		
		return "redirect:/dojos";
	}

	
	@GetMapping( "/dojos" )
	public String dojos( Model model ) {
		
		List<Dojo> dojos = dojoService.findAll();
		
		model.addAttribute( "dojos", dojos );
		
		return "dojos/index.jsp";
	}
	
	// ********** Add View *********************
	
	@GetMapping( "/dojos/add" )
	public String add( @ModelAttribute( "dojo" ) Dojo dojo ) {
		
		return "dojos/add.jsp";
	}
	

	// ********** Details View *****************
	
	@GetMapping( "/dojos/view/{id}" )
	public String details( @PathVariable( "id" ) Long id, Model model) {
		
		Dojo dojo = dojoService.findOne( id );
		
		model.addAttribute( "dojo", dojo );
		
		return "dojos/details.jsp";
		
	}
	
	// ********** Edit View ********************
	
	@GetMapping( "/dojos/edit/{id}" )
	public String edit( @PathVariable( "id" ) Long id, Model model ) {
		
		Dojo dojo = dojoService.findOne( id );
		
		model.addAttribute("dojo", dojo);
		
		return "dojos/edit.jsp";
	}
	
	
	// ========== Action Routes ================ //
	
	// ********** Create ***********************
	
	@PostMapping( "/dojos/create" )
	public String create( @Valid @ModelAttribute( "dojo" ) Dojo dojo, BindingResult result, Model model ) {
		
		if ( result.hasErrors() ) {
			
			return "dojos/add.jsp";
		}
		
		else {
			
			dojoService.save( dojo );
			
			return "redirect:/dojos";
		}
	}
	
	// ********** Update ***********************
	
	@PutMapping( "/dojos/edit/{id}" )
	public String update(  @PathVariable( "id" ) Long id, @Valid @ModelAttribute( "dojo" ) Dojo dojo, BindingResult result, Model model ) {
		
		if ( result.hasErrors() ) {
			
			// Dojo oldDojo = dojoService.findOne( id );
			
			// model.addAttribute( "dojo", oldDojo );
			
			return "dojos/edit.jsp";
		}
		
		else {
			
			dojoService.save(dojo);
			
			return "redirect:/dojos";
		}
	}
}
