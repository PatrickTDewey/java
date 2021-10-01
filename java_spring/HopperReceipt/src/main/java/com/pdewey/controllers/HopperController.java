package com.pdewey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HopperController {
	// class definition and imports here...
	@RequestMapping("/")
	public String index(Model model) {

		String name = "Patrick Dewey";
		String itemName = "Machete";
		double price = 10.00;
		String description = "A machete used to mow down zombies.";
		String vendor = "Ed's Post Apocalyptic Survival Store";

		// Your code here! Add values to the view model to be rendered
		model.addAttribute("name", name);
		model.addAttribute("itemName", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);
		return "index.jsp";
	}
	// ...

}
