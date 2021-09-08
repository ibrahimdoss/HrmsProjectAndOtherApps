package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvProgrammingLanguage;

public interface CvProgrammingLanguageService {

	Result add(CvProgrammingLanguage cvProgrammingLanguage);
	
	Result update(CvProgrammingLanguage cvProgrammingLanguage);
	
	Result delete(int id);
	
	DataResult<CvProgrammingLanguage> getById(int id);	
	
	DataResult<List<CvProgrammingLanguage>> getAll();
	
	DataResult<List<CvProgrammingLanguage>> getAllByJobHunterId(int id);
}
