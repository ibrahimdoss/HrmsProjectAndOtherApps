package com.example.hrmsNineWork.core.verification;

public interface VerificationService {
	
	void sendLink(String email);
	String sendCode();
}
