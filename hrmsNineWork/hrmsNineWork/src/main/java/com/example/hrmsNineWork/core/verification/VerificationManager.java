package com.example.hrmsNineWork.core.verification;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService{

	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Doprulama linki " + email +" hesabınıza gönderilmiştir" );
		System.out.println("Hesabınızı doğrulamak için linke tıklayın :  " + verificationLink );		
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println(" Aktivasyon kodunuz :  " + verificationCode );
		return verificationCode;
	}

}
