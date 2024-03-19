package com.plano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.plano.dto.User;

@Component
public interface IUserRepo extends JpaRepository<User, Integer> {
	public User findByEmail(String Email);
}
