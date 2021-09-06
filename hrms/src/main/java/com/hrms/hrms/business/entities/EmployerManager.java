package com.hrms.hrms.business.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.EmployerService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.ErrorResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.EmployerDao;
import com.hrms.hrms.entities.concretes.Employer;
import com.hrms.hrms.verification.mailVerification.MailValidationService;
import com.hrms.hrms.verification.personVerification.PersonValidationService;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private MailValidationService mailValidationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, MailValidationService mailValidationService, PersonValidationService personValidationService) {
		super();
		this.employerDao = employerDao;
		this.mailValidationService=mailValidationService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"İş verenler Listelendi");
	}

	@Override
	public Result addEmployer(Employer employer) {
		  if (mailValidationService.isRealEmail(employer.getEmail())) {
	            employerDao.save(employer);
	            return new SuccessResult("Yeni işveren eklendi");
	        }
	        else{
	            return new ErrorResult("Mail doğrulanamadı");
	        }
		  
	}
	
}
