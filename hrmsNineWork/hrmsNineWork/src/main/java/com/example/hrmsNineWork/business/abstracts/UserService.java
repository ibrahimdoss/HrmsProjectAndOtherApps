package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.User;

public interface UserService {
	
	Result add(User user);
	
	DataResult<List<User>> getAll();
	
	DataResult<User> getUserByEmail(String email);
}
