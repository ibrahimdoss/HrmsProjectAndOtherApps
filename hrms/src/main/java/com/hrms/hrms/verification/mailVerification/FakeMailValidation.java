package com.hrms.hrms.verification.mailVerification;

import org.springframework.stereotype.Service;

@Service
public class FakeMailValidation implements MailValidationService {

	@Override
	public boolean isRealEmail(String email) {
		return true;
	}

}
