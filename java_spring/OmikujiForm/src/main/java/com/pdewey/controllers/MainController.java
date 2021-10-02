package com.pdewey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	// Display Routes
	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}

	
	@RequestMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		model.addAttribute(session.getAttribute("number"));
		model.addAttribute(session.getAttribute("city"));
		model.addAttribute(session.getAttribute("name"));
		model.addAttribute(session.getAttribute("hobby"));
		model.addAttribute(session.getAttribute("animal"));
		model.addAttribute(session.getAttribute("nice"));
		return "dashboard.jsp";
	}

	
	// Action Routes
	@PostMapping("/submit")
	public String login(@RequestParam(value = "number") int number, 
			@RequestParam(value = "city") String city,
			@RequestParam(value = "name") String name,
			@RequestParam(value = "hobby") String hobby,
			@RequestParam(value = "animal") String animal,
			@RequestParam(value = "nice") String nice,
			HttpSession session) {

		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("nice", nice);

		

		return "redirect:/dashboard";
	}
}
