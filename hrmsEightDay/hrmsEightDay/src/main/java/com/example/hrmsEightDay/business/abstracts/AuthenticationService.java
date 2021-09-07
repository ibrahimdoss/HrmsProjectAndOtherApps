package com.example.hrmsEightDay.business.abstracts;

import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.entities.concretes.Employer;
import com.example.hrmsEightDay.entities.concretes.JobHunter;

public interface AuthenticationService {
	
	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerJobHunter(JobHunter jobHunter, String confirmPassword);

}
