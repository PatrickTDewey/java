package com.pdewey.pokebook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pdewey.pokebook.models.Expense;
import com.pdewey.pokebook.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	// ********** Member Variables *************
	
	private final ExpenseRepository expenseRepository;
	
	// ********** Constructors *****************
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		
		this.expenseRepository = expenseRepository;
	}
	
	
	// ********** Create / Update **************
	
	public Expense createExpense( Expense expense ) {
		
		return expenseRepository.save( expense );
	}
	
	
	// ********** Find All *********************
	public List<Expense> allExpenses(){
		
		return expenseRepository.findAll();
	}
	
	// ********** Find One *********************
	public Expense findOneExpense( Long id ) {
		
		Optional<Expense> expenseOptional = expenseRepository.findById( id );
		
		if( expenseOptional.isPresent() ) {
			
			return expenseOptional.get();
		}

		else {
			
			return null;
		}
	}
	
	
	// ********** Delete ***********************
	public void deleteExpense(Long id) {
		
		expenseRepository.deleteById(id);
	}
	
}
