package com.example.hrmsEightDay.business.abstracts;

import java.util.List;

import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.entities.abstracts.User;

public interface UserService {
	Result add(User user);
	
	DataResult<List<User>> getAll();
	
	DataResult<User> getUserByEmail(String email);
}
