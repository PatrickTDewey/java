package com.pdewey.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdewey.languages.models.Language;
import com.pdewey.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	// ***** Auto Add Repository Dependency ****
	
	@Autowired
	LanguageRepository languageRepo;
	
	// ********** Find All *********************
	
	public List<Language> findAll(){
		
		return languageRepo.findAll();
	}
	
	// ********** Find One *********************
	
	public Language findOne( Long id ) {
		
		Optional<Language> langOptional = languageRepo.findById( id );
		
		if ( langOptional.isPresent() ) {
			
			return langOptional.get();
		}
		
		else {
			
			return null;
		}
	}
	
	// ********** Create / Update **************
	
	public Language save( Language language ) {
		
		return languageRepo.save( language );
	}
	
	// ********** Delete ***********************
	
	public void delete( Long id ) {
		
		languageRepo.deleteById( id );
	}

}
