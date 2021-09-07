package com.example.hrmsEightDay.business.abstracts;

import java.util.List;

import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.entities.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	
	DataResult<List<Employer>> getAll();
	
	
}
