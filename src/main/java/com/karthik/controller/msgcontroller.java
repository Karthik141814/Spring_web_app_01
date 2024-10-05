package com.karthik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class msgcontroller {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() { 
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Wlcome to the Karthik World ....!!");
		mav.setViewName("message");
		return mav;
	}
	@GetMapping("/greeting")
	public ModelAndView getGreetingMsg() { 
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Good Evening Every One...!!");
		mav.setViewName("message");
		return mav;
	}
	
}
