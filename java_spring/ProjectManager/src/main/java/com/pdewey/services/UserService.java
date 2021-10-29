package com.pdewey.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.pdewey.models.LoginUser;
import com.pdewey.models.User;
import com.pdewey.repositories.UserRepository;

@Service
public class UserService {
	
	// ********** Auto Add Repository Deps *****
	
	@Autowired
	private UserRepository userRepository;
	
	
	// ********** Create / Update **************
	
	public User register( User newUser, BindingResult result ) {
		
		if ( userRepository.findByEmail( newUser.getEmail() ).isPresent() ) {
			
			result.rejectValue( "email", "Unique", "This email is already in use." );
		}
		
		if ( !newUser.getPassword().equals( newUser.getConfirm()) ) {
			
			result.rejectValue( "confirm", "Matches", "Passwords must match." );
		}
		
		if ( result.hasErrors() ) {
			
			return null;
		}
		
		else {
			
			String hashed = BCrypt.hashpw( newUser.getPassword(), BCrypt.gensalt() );
			
			newUser.setPassword( hashed );
			
			return userRepository.save( newUser );
		}
	}
	
	// ********** Find One *********************
	
	public User getUser( Long id ) {
		
		Optional<User> userOptional = userRepository.findById( id );
		
		if ( userOptional.isPresent() ) {
			
			return userOptional.get();
		}
		
		return null;
	}
	
	// ********** Login User *******************
	
	public User login( LoginUser newLogin, BindingResult result ) {
		
		if ( result.hasErrors() ) {
			return null;
		}
		
		Optional< User > potentialUser = userRepository.findByEmail( newLogin.getEmail() );
		
		if ( !potentialUser.isPresent() ) {
			
			result.rejectValue( "email", "Unique", "Invalid email/password." );
			
			return null;
		}
		
		User user = potentialUser.get();
		
		if ( !BCrypt.checkpw( newLogin.getPassword(), user.getPassword() ) ) {
			
			result.rejectValue( "password", "Matches", "Invalid email/password." );
		}
		
		if ( result.hasErrors() ) {
			
			return null;
		}
		
		else {
			
			return user;
		}
	}
	
}
