package com.example.hrmsNineWork.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.VerificationCodeService;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.dataAccess.abstracts.AuthenticationCodeDao;
import com.example.hrmsNineWork.entities.concretes.AuthenticationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService{
	
	private AuthenticationCodeDao authenticationCodeDao;
	
	@Autowired
	public VerificationCodeManager(AuthenticationCodeDao authenticationCodeDao) {
		super();
		this.authenticationCodeDao = authenticationCodeDao;
	}

	@Override
	public Result add(AuthenticationCode code) {
		this.authenticationCodeDao.save(code);
		return new SuccessResult("Kod kaydedildi.");
	}
}
