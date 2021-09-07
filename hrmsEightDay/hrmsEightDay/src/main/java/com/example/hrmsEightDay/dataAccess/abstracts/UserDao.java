package com.example.hrmsEightDay.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsEightDay.entities.abstracts.User;


@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
	User getByEmail(String email);
}
