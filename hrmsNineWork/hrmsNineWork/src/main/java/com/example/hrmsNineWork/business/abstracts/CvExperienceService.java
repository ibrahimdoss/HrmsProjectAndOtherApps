package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvExperience;

public interface CvExperienceService {
	
	Result add(CvExperience cvExperience);
	
	Result update ( CvExperience cvExperience);
	
	Result delete(int id);
	
	DataResult<CvExperience> getById(int id);
	
	DataResult<List<CvExperience>> getAll();
	
	DataResult<List<CvExperience>> getAllByJobHunterIdOrderByEndAtDesc(int id);
	
	DataResult<List<CvExperience>> getAllByJobHunterId(int id);
}
