package com.example.hrmsNineWork.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.EmployerService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessDataResult;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.dataAccess.abstracts.EmployerDao;
import com.example.hrmsNineWork.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {
private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		
		this.employerDao.save(employer);
		return new SuccessResult(" İşveren Eklendi.");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	
		
	}
}
