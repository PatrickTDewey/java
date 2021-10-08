package com.pdewey.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdewey.dojos.models.Ninja;
import com.pdewey.dojos.repositories.NinjaRepo;

@Service
public class NinjaService {
	
	// ***** Auto Add Repository Dependency ****
	
	@Autowired
	private NinjaRepo ninjaRepo;
	
	// ********** Create / Update **************
	
	public Ninja save( Ninja ninja ) {
		
		return ninjaRepo.save( ninja );
	}

	// ********** Find One *********************
	
	public Ninja findOne( Long id ) {
			
		Optional<Ninja> ninjaOptional = ninjaRepo.findById( id );
		
		if( ninjaOptional.isPresent() ) {
			
			return ninjaOptional.get();
		}

		else {
			
			return null;
		}
	}

	// ********** Find All *********************
	
	public List<Ninja> findAll(){
		
		return ninjaRepo.findAll();
	}
	

	// ********** Delete ***********************
	
	public void delete( Long id ) {
		
		ninjaRepo.deleteById( id );
	}
}
