package com.pdewey.pokebook.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pdewey.pokebook.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	
	// ********** Find All Method Required *************
	List<Expense> findAll();
}
