package com.example.hrmsEightDay.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsEightDay.business.abstracts.UserService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.entities.abstracts.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;

	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}

	
}
