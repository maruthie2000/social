package com.plano.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plano.dao.CommonDao;
import com.plano.dto.User;

import jakarta.servlet.http.HttpSession;

@Component
public class UserService {
	@Autowired
	CommonDao commonDao;
	
	public String signUp(User user,HttpSession httpSession) {
		if(commonDao.verifyEmail(user.getEmail())) {
			commonDao.signUp(user);
			return "user already exists";
		}else {
			return "signup succesfull..";
		}
			 
	}
}
