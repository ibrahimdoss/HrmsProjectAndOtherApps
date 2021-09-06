package com.hrms.hrms.verification.personVerification;

import org.springframework.stereotype.Service;

import com.hrms.hrms.entities.concretes.JobSeeker;

@Service
public class FakeMernisValidation implements PersonValidationService {

	
	
	

	@Override
	public boolean isRealPerson(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		return false;
	}

}
