package com.example.hrmsEightDay.business.abstracts;

import java.util.List;

import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.entities.concretes.JobHunter;

public interface JobHunterService {
	
	
	Result add(JobHunter jobHunter);
	
	DataResult<List<JobHunter>> getAll();
	
	DataResult<JobHunter> getJobHunterByNationalId(String nationalId);
}
