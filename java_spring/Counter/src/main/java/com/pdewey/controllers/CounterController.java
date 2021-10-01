package com.pdewey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} 
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount++;
		session.setAttribute("count", currentCount);
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counterRoute(HttpSession session, Model model){
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} 
		model.addAttribute("currentCount", session.getAttribute("count"));
		return "counter.jsp";
	}
	@RequestMapping("/add_two")
	public String addTwo(HttpSession session) {
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount++;
		session.setAttribute("count",currentCount);
		System.out.println(currentCount);
		return "redirect:/";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/";
	}
}
