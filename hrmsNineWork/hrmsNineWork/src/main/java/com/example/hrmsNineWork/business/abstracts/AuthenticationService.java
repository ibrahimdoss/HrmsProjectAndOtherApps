package com.example.hrmsNineWork.business.abstracts;

import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.Employer;
import com.example.hrmsNineWork.entities.concretes.JobHunter;

public interface AuthenticationService {
	
	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerJobHunter(JobHunter jobHunter, String confirmPassword);

}
