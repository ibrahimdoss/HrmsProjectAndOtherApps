package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvLink;

public interface CvLinkService {
	Result add(CvLink cvLink);
	
	Result update(CvLink cvLink);
	
	Result delete(int id);
	
	DataResult<CvLink> getById(int id);	
	
	DataResult<List<CvLink>> getAll();
	
	DataResult<List<CvLink>> getAllByJobHunterId(int id);
}
