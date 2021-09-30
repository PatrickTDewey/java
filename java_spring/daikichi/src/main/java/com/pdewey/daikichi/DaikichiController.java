package com.pdewey.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	@RequestMapping(value="/today")
	public String todayRoute() {
		return "Today you will find luck in all your endeavors";
	}
	@RequestMapping(value="/tomorrow", method=RequestMethod.GET)
	public String tomorrowRoute() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}
