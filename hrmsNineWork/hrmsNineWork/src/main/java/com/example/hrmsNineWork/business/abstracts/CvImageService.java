package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvImage;

public interface CvImageService {
	
	Result add(CvImage cvImage, MultipartFile imageFile);

	Result update(CvImage cvImage);
	
	Result delete(int id);
	
	DataResult<CvImage> getById(int id);	
	
	DataResult<List<CvImage>> getAll();
	
	DataResult<CvImage> getByJobHunterId(int id);
}
