package com.pdewey.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value = "q", required = false) String searchQuery,
			@RequestParam(value = "lastName", required = false) String lastName,
			@RequestParam(value = "times", required = false) String times) {
		if (times == null) {
			System.out.println("times is null");
			System.out.println(times);
			if (searchQuery == null) {
				return "Hello Human";
			} else if (lastName == null) {
				return "Hello " + searchQuery;
			} else {
				return "Hello" + " " + searchQuery + " " + lastName;

			}
		} else {
			int multiplier = Integer.parseInt(times);
			String multipliedString = "";
			for(int i = 0; i < multiplier; i++) {
				multipliedString += searchQuery + " " + lastName + " ";
			}
			System.out.println(multipliedString);
			return multipliedString;
		}

	}
}
