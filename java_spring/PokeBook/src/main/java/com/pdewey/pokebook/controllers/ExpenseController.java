package com.pdewey.pokebook.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pdewey.pokebook.models.Expense;
import com.pdewey.pokebook.services.ExpenseService;

@Controller
public class ExpenseController {
	
	// ********** Member Variables *************
	private final ExpenseService expenseService;
	
	// ********** Constructor ******************
	public ExpenseController( ExpenseService expenseService ) {
		
		this.expenseService = expenseService;
	}
	
	// ********** Display Routes ***************
	@GetMapping( "/" )
	public String index(){
		
		return "redirect:/expenses";
	}
	
	@GetMapping( "/expenses" )
	public String expenseDashboard( @ModelAttribute( "expense" ) Expense expense, Model model ) {
		
		ArrayList<Expense> expenses = ( ArrayList<Expense> ) expenseService.allExpenses();
		
		model.addAttribute("expenses", expenses);
		
		return "/tracker/index.jsp";
	}
	
	// ********** Action Routes ****************
	@PostMapping( "/expenses/create" )
	public String addExpense( @Valid @ModelAttribute( "expense" ) Expense expense, BindingResult result, Model model  ) {
		
		if ( result.hasErrors() ) {
			ArrayList<Expense> expenses = ( ArrayList<Expense> ) expenseService.allExpenses();
			
			model.addAttribute("expenses", expenses);
			
			return "/tracker/index.jsp";
		}
		
		else {
			
			expenseService.createExpense( expense );
			
			return "redirect:/expenses";
		}
	}
	
}
