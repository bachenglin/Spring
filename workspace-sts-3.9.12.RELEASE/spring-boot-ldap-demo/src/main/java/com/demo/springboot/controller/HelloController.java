package com.demo.springboot.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

   @RequestMapping("/")
   public String index(Model model, Principal principal) {
	   if(principal != null)
           model.addAttribute("msg", "Welcome " + principal.getName() +" into Spring Boot LDAP managed user using BASIC authentication."); 
      
	   return "index";
   }

}
