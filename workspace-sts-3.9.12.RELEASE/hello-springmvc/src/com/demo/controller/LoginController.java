package com.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;

@Controller("login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String showLoginForm(Map model) {
		
		LoginForm loginForm = new LoginForm();
		
		model.put("loginForm", loginForm);
	
		return "loginform";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String processLogin(Map model, @Valid LoginForm loginForm, BindingResult result) {
		
		System.out.println(loginForm.getUsername() +":" + loginForm.getPassword());
		
		//model.put("loginForm", loginForm);
		//model.put("myname", "james");
		
		if(result.hasErrors()) {
			return "loginform";
		}
		
		if(loginForm.getUsername().equals("Admin") && loginForm.getPassword().equals("admin123"))
			return "welcome";
		else
		{
			model.put("errorMessage","invalid credentials");
			return "error";
		}
			
		
		
	}
}
