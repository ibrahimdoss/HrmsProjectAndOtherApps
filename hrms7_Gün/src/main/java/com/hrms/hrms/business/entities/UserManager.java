package com.hrms.hrms.business.entities;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.UserService;
import com.hrms.hrms.dataAccess.abstracts.UserDao;
import com.hrms.hrms.entities.abstracts.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

}
