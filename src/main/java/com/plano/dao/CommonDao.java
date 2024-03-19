package com.plano.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plano.dto.User;
import com.plano.repository.IUserRepo;

@Component
public class CommonDao {
	@Autowired
	IUserRepo iUserRepo;

	public void signUp(User user) {
		iUserRepo.save(user);
		
	}

	public boolean verifyEmail(String email) {
		User user = iUserRepo.findByEmail(email);
		if (user != null)
			return true;
		else
			return false;
	}

}
