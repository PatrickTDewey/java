package com.pdewey.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.pdewey.languages.models.Language;
import com.pdewey.languages.services.LanguageService;

@Controller
public class LanguageController {
	
	// ***** Auto Add Repository Dependency ****
	
	@Autowired
	LanguageService langService;
	
	// ********** Display Routes ***************
	
	@GetMapping( "/" )
	public String index() {
		
		return "redirect:/languages";
	}
	
	@GetMapping( "/languages" )
	public String dashboard( @ModelAttribute( "language" ) Language language, Model model ) {
		
		List<Language> languages = langService.findAll();
		
		model.addAttribute( "languages", languages );
		
		return "languages/index.jsp";
	}
	
	@GetMapping( "/languages/view/{id}" )
	public String view( @PathVariable( "id" ) Long id, Model model ) {
		
		Language language = langService.findOne( id );
		
		model.addAttribute( "language", language );
		
		return "languages/details.jsp";
	}
	
	@GetMapping( "/languages/edit/{id}" )
	public String edit( @PathVariable( "id" ) Long id, Model model ) {
		
		Language language = langService.findOne( id );
		
		model.addAttribute( "language", language );
		
		return "languages/edit.jsp";
	}
	
	// ********** Action Routes ****************
	
	@PostMapping( "/languages/create" )
	public String add( @Valid @ModelAttribute( "language" ) Language language, BindingResult result, Model model ) {
		
		if ( result.hasErrors() ) {
			
			List<Language> languages = langService.findAll();
			
			model.addAttribute( "languages", languages );
			
			return "languages/index.jsp";
		}
		
		else {
			
			langService.save( language );
			
			return "redirect:/languages";
		}
	}
	
	@PutMapping( "/languages/edit/{id}" )
	public String update( @Valid @ModelAttribute( "language" ) Language language, BindingResult result) {
		
		if ( result.hasErrors() ) {
			
			return "languages/edit.jsp";
		}
		
		else {
			
			langService.save( language );
			
			return "redirect:/languages";
		}
	}
	
	@DeleteMapping( "/languages/delete/{id}" )
	public String delete( @PathVariable( "id" ) Long id ) {
		
		langService.delete( id );
		
		return "redirect:/languages";
	}
}
