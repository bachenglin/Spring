package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Group;
import com.demo.model.User;

@Controller
@RequestMapping("/group/users")
public class UserController {
	
	@RequestMapping(value="{name}",method = RequestMethod.GET)
	public @ResponseBody Group getUsersInGroup(@PathVariable String name) {
		
		ArrayList<User> users = new ArrayList<>(
				Arrays.asList(
			new User(50,"john","Smith"),
			new User(75,"johny","Depp")
			)
	);
		
		Group group = new Group();
		group.setName(name);
		group.setList(users);
		
		return group;
	}

}
