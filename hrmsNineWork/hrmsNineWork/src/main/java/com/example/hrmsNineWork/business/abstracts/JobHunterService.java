package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.JobHunter;
import com.example.hrmsNineWork.entities.dtos.CvDto;

public interface JobHunterService {

	Result add(JobHunter jobHunter);
	
	Result update(JobHunter jobHunter);
	
	Result delete(int id);
	
	DataResult<JobHunter> getById(int id);
	
	DataResult<List<JobHunter>> getAll();
	
	DataResult<JobHunter> getJobHunterByNationalId(String nationalId);
	
	DataResult<CvDto> getJobHunterCVById(int id);
}
