package com.pdewey.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value="/travel/{location}", method=RequestMethod.GET)
	public String travelRoute(@PathVariable("location") String location) {
		return "Congratulations, you will soon travel to "+ location;
	}
	@RequestMapping(value="/lotto/{number}", method=RequestMethod.GET)
	public String lottoRoute(@PathVariable("number") String number) {
		int toNumber = Integer.parseInt(number);
		if(toNumber % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}
	
}
