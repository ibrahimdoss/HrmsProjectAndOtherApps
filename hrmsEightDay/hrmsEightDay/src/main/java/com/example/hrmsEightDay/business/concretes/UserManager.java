package com.example.hrmsEightDay.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hrmsEightDay.business.abstracts.UserService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.core.utilities.results.SuccessDataResult;
import com.example.hrmsEightDay.core.utilities.results.SuccessResult;
import com.example.hrmsEightDay.dataAccess.abstracts.UserDao;
import com.example.hrmsEightDay.entities.abstracts.User;

@Service
public class UserManager implements UserService {
		
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı Eklendi");
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.getByEmail(email));
	}
}
