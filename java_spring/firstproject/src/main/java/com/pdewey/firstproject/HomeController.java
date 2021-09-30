package com.pdewey.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {

	// 1. Annotation
	@RequestMapping("")
	public String hello() {
		return "Hello World";
	}

	// 2. New route
	@RequestMapping("/new_route")
	public String greet() {
		return "You made it to the new route";
	}

	// 3. world route
	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool too.";

	}

}
