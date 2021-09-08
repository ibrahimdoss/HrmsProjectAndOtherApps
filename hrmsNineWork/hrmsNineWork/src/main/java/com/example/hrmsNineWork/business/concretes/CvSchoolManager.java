package com.example.hrmsNineWork.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.CvSchoolService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessDataResult;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.dataAccess.abstracts.CvSchoolDao;
import com.example.hrmsNineWork.entities.concretes.CvSchool;

@Service
public class CvSchoolManager implements CvSchoolService {
private CvSchoolDao cvSchoolDao;
	
	@Autowired
	public CvSchoolManager(CvSchoolDao cvSchoolDao) {
		super();
		this.cvSchoolDao = cvSchoolDao;
	}

	@Override
	public Result add(CvSchool cvSchool) {
		this.cvSchoolDao.save(cvSchool);
		return new SuccessResult("School has been added.");
	}

	@Override
	public Result update(CvSchool cvSchool) {
		this.cvSchoolDao.save(cvSchool);
		return new SuccessResult("School has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvSchoolDao.deleteById(id);
		return new SuccessResult("School has been deleted.");
	}

	@Override
	public DataResult<CvSchool> getById(int id) {
		return new SuccessDataResult<CvSchool>(this.cvSchoolDao.getById(id));
	}

	@Override
	public DataResult<List<CvSchool>> getAll() {
		return new SuccessDataResult<List<CvSchool>>(this.cvSchoolDao.findAll());
	}

	@Override
	public DataResult<List<CvSchool>> getAllByJobHunterIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<CvSchool>>(this.cvSchoolDao.getAllByJobHunter_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<CvSchool>> getAllByJobHunterId(int id) {
		return new SuccessDataResult<List<CvSchool>>(this.cvSchoolDao.getAllByJobHunter_id(id));
	}
}	
