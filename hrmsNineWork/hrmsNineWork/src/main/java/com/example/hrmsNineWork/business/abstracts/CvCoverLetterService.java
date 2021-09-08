package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvCoverLetter;

public interface CvCoverLetterService {
	
	Result add(CvCoverLetter coverLetter);
	
	Result update(CvCoverLetter cvCoverLetter);
	
	Result delete(int id);
	
	DataResult<CvCoverLetter> getById(int id);
	
	DataResult<List<CvCoverLetter>> getAll();
}
