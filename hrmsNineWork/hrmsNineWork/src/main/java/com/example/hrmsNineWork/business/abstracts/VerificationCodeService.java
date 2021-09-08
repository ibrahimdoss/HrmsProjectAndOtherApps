package com.example.hrmsNineWork.business.abstracts;

import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.AuthenticationCode;

public interface VerificationCodeService {
	
	Result add(AuthenticationCode code);

}
