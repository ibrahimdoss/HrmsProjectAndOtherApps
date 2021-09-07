package com.example.hrmsEightDay.core.verification;

public interface VerificationService {
	
	void sendLink(String email);
	void sendCode(String email, int id);
}
