package com.hrms.hrms.verification.personVerification;

import com.hrms.hrms.entities.concretes.JobSeeker;

public interface PersonValidationService {
	
	boolean isRealPerson(JobSeeker jobSeeker);
}
