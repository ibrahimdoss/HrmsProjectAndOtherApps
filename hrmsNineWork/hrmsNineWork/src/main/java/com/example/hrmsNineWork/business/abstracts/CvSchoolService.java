package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvSchool;

public interface CvSchoolService {

	Result add(CvSchool cvSchool);
	
	Result update(CvSchool cvSchool);
	
	Result delete(int id);
	
	DataResult<CvSchool> getById(int id);	
	
	DataResult<List<CvSchool>> getAll();
	
	DataResult<List<CvSchool>> getAllByJobHunterIdOrderByEndAtDesc(int id);
	
	DataResult<List<CvSchool>> getAllByJobHunterId(int id);
}
