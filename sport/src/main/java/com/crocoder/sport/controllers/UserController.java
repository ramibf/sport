package com.crocoder.sport.controllers;


	//import org.springframework.beans.factory.annotation.Autowired(required=true);
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crocoder.sport.models.User;
import com.crocoder.sport.services.UserService;

	
	@CrossOrigin("http://localhost:4200")
	@RestController
	@RequestMapping("api/user")
	public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/signup")
	 public User login(@RequestBody User user){
	 return userService.signup(user);
	}	
	@PostMapping("/login")
	public User signup(@RequestBody User user) {
	 return userService.login(user.getEmail(),user.getPwd());
	}	
	
}
