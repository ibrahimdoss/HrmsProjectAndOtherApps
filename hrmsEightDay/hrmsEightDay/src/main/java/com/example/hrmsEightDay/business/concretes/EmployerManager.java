package com.example.hrmsEightDay.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsEightDay.business.abstracts.EmployerService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.core.utilities.results.SuccessDataResult;
import com.example.hrmsEightDay.core.utilities.results.SuccessResult;
import com.example.hrmsEightDay.dataAccess.abstracts.EmployerDao;
import com.example.hrmsEightDay.entities.concretes.Employer;


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
		return new SuccessResult("İşveren Eklendi");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}
	
}
