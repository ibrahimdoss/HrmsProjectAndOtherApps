package com.example.hrmsNineWork.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.CvForeignLanguageService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessDataResult;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.dataAccess.abstracts.CvForeignLanguageDao;
import com.example.hrmsNineWork.entities.concretes.CvForeignLanguage;

@Service
public class CvForeignLanguageManager implements CvForeignLanguageService{
private CvForeignLanguageDao cvForeignLanguageDao;
	
	@Autowired
	public CvForeignLanguageManager(CvForeignLanguageDao cvForeignLanguageDao) {
		super();
		this.cvForeignLanguageDao = cvForeignLanguageDao;
	}

	@Override
	public Result add(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLanguageDao.save(cvForeignLanguage);
		return new SuccessResult("Yabancı dil eklendi");
	}

	@Override
	public Result update(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLanguageDao.save(cvForeignLanguage);
		return new SuccessResult("Yabancı dil güncellendi");
	
	}

	@Override
	public Result delete(int id) {
		this.cvForeignLanguageDao.deleteById(id);;
		return new SuccessResult("Yabancı dil silindi.");
	}

	@Override
	public DataResult<CvForeignLanguage> getById(int id) {
		return new SuccessDataResult<CvForeignLanguage>(this.cvForeignLanguageDao.getById(id));
	}

	@Override
	public DataResult<List<CvForeignLanguage>> getAll() {
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguageDao.findAll());
	}

	@Override
	public DataResult<List<CvForeignLanguage>> getAllByJobHunterId(int id) {
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguageDao.getAllByJobHunter_id(id));
	}
}
