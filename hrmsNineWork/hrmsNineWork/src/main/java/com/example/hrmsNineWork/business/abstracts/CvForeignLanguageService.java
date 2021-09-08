package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvForeignLanguage;

public interface CvForeignLanguageService {
	
	Result add(CvForeignLanguage cvForeignLanguage);
	
	Result update (CvForeignLanguage cvForeignLanguage);
	
	Result delete(int id);
	
	DataResult<CvForeignLanguage> getById(int id);
	
	DataResult<List<CvForeignLanguage>> getAll();
	
	DataResult<List<CvForeignLanguage>> getAllByJobHunterId(int id );
}
