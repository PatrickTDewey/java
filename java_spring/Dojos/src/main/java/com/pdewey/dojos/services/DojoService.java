package com.pdewey.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdewey.dojos.models.Dojo;
import com.pdewey.dojos.repositories.DojoRepo;

@Service
public class DojoService {
	
	// ***** Auto Add Repository Dependency ****
	
	@Autowired
	private DojoRepo dojoRepo;
	

	// ********** Create / Update **************
	
	public Dojo save( Dojo dojo ) {
		
		return dojoRepo.save( dojo );
	}

	// ********** Find One *********************
	
	public Dojo findOne( Long id ) {
		
		Optional<Dojo> dojoOptional = dojoRepo.findById( id );
		
		if( dojoOptional.isPresent() ) {
			
			return dojoOptional.get();
		}

		else {
			
			return null;
		}
	}

	// ********** Find All *********************
	
	public List<Dojo> findAll(){
		
		return dojoRepo.findAll();
	}
	
	// ********** Delete ***********************
	
	public void delete( Long id ) {
		
		dojoRepo.deleteById( id );
	}
}
