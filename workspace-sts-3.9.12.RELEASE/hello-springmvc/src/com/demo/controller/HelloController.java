package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("sayhello")
	public ModelAndView sayHi() {
		String message = "welcome to Spring MVP and Topics!";
		//1st name of view page
		//2nd param name of the data returning to view
		//3rd param value representing the data which is sent to view
		return new ModelAndView("hello","mymessage",message);
	}

}
