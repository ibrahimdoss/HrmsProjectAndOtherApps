package com.hrms.hrms.business.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.JobSeekerService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.ErrorResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.JobSeekerDao;
import com.hrms.hrms.entities.concretes.JobSeeker;
import com.hrms.hrms.verification.mailVerification.MailValidationService;
import com.hrms.hrms.verification.personVerification.PersonValidationService;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;
	private MailValidationService mailValidationService;
	private PersonValidationService personValidationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,MailValidationService mailValidationService, PersonValidationService personValidationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mailValidationService= mailValidationService;
		this.personValidationService= personValidationService;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(jobSeekerDao.findAll(),"İş Arayanlar Listelendi");
	}

	@Override
	public Result addJobSeeker(JobSeeker jobSeeker) {
		 if (personValidationService.isRealPerson(jobSeeker) && mailValidationService.isRealEmail(jobSeeker.getEmail())){
	            jobSeekerDao.save(jobSeeker);
	            return new SuccessResult("Yeni iş arayan eklendi");
	        }
	        else {
	            return new ErrorResult("Kullanıcı doğrulanamadı");
	        }	}



}
