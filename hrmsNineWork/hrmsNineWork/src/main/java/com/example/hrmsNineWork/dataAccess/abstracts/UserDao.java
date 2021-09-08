package com.example.hrmsNineWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.User;

@Repository
public interface UserDao  extends JpaRepository<User, Integer>{
	
	User getByEmail(String email);
	
}
