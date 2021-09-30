package com.caresoft.clinicapp;

public interface PHICompliantUser {
	// Expected to assign the pin to the user (as a member variable)
	abstract boolean assignPin(int pin);
	
	// Expected to compare instance id with id passed in. Returns true of false.
	abstract boolean isAuthorized(Integer confirmedAuthID);
	
	
}
