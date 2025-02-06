package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

import com.user.model.UserDetails;
import com.user.service.UserService;

import jakarta.servlet.http.HttpSession;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute UserDetails userDetails, HttpSession session) {
//		System.out.println(userDetails);
		
		if(userService.checkEmail(userDetails.getEmail())) {
			session.setAttribute("msg", "Email id already exists");
			session.removeAttribute("Email id already exists");
		}
		else {
			UserDetails user = userService.createUser(userDetails);
			if(user != null) {
				session.setAttribute("msg", "User registered successfully");
			}
			else {
				session.setAttribute("msg", "Error in the server");
			}
		}
		return "redirect:/register";
	}

}
