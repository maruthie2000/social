package com.plano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plano.dto.User;
import com.plano.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService commonService;
	
	@PostMapping("/signUp")
	public String Signup(@RequestBody User user,HttpSession httpSession){
		return commonService.signUp(user,httpSession);
	}
}
