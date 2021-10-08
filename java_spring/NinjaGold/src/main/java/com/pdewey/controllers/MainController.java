package com.pdewey.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		
		if (session.getAttribute("messages") == null) {
			session.setAttribute( "messages" , new ArrayList<String>());
		}
		
		
		if(session.getAttribute("messages") !=  null) {
			model.addAttribute("messages", session.getAttribute("messages"));
			
		}
		
		Integer currentGold = (Integer) session.getAttribute("gold");
		model.addAttribute("gold", currentGold);
	
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String updateGold(HttpSession session, @RequestParam(value = "process") String process) {
		
		Random random = new Random();
		
		//  Unchecked cast from Object to array list
		@SuppressWarnings("unchecked")
		ArrayList<String> sessionMessages = (ArrayList<String>) session.getAttribute("messages");
		
	
		
		
		switch (process) {
		
			case "farm":
				int randomTenToTwenty = random.nextInt(11) + 10;
				String farmMessage = "You entered the farm and earned " + randomTenToTwenty + " gold." + new Date();
				
				sessionMessages.add(farmMessage);
				sessionMessages.forEach(uniqueMessage -> System.out.println(uniqueMessage));
				
				session.setAttribute( "gold" , (int) session.getAttribute( "gold" ) + randomTenToTwenty);
				
				break;
				
			case "cave":
				int randomFiveToTen = random.nextInt(6) + 5;
				String caveMessage = "You entered the cave and earned " + randomFiveToTen + " gold." + new Date();
				
				sessionMessages.add(caveMessage);
				sessionMessages.forEach(uniqueMessage -> System.out.println(uniqueMessage));
				
				session.setAttribute( "gold" , (int) session.getAttribute( "gold" ) + randomFiveToTen);
				
				break;
				
			case "house":
				int randomTwoToFive = random.nextInt(3) + 3;
				String houseMessage = "You entered the house and earned " + randomTwoToFive + " gold." + new Date();
				
				sessionMessages.add(houseMessage);
				sessionMessages.forEach(uniqueMessage -> System.out.println(uniqueMessage));
				
				session.setAttribute( "gold" , (int) session.getAttribute( "gold" ) + randomTwoToFive);
				
				System.out.println(process);
				
				break;
				
			case "casino":
				System.out.println("casino");
				
				// generates random number between -50 - 50
				int randomCasino = random.nextInt(101)-50;
				
				if (randomCasino >= 0) {
					String casinoWin = "You entered the casino and earned " + randomCasino + " gold." + new Date();
					sessionMessages.add(casinoWin);
					
				} 
				
				else {
					String casinoLose = "You entered the casino and lost " + randomCasino + " gold." + new Date();
					sessionMessages.add(casinoLose);
				}
				
				sessionMessages.forEach(uniqueMessage -> System.out.println(uniqueMessage));
				session.setAttribute( "gold" , (int) session.getAttribute( "gold" ) + randomCasino);
				
				break;
				
			default:
				System.out.println("No case statement evaluated to true");
				break;
				
		}
		
		return "redirect:/";
	}
}
