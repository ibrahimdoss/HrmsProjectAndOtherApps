package com.example.hrmsEightDay.core.verification;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsEightDay.dataAccess.abstracts.AuthenticationCodeDao;
import com.example.hrmsEightDay.entities.concretes.AuthenticationCode;

@Service
public class VerificationManager implements VerificationService{

	private AuthenticationCodeDao authenticationCodeDao;
	
	@Autowired
	public VerificationManager(AuthenticationCodeDao authenticationCodeDao) {
		super();
		this.authenticationCodeDao = authenticationCodeDao;
	}

	@Override
	public void sendLink(String email) {

		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Doğrulama linki " + email + " gönderildi" );
		System.out.println("Hesabınızı doğrulamak için linke tıklayın  " + verificationLink );	}

	@Override
	public void sendCode(String email, int id) {
		UUID uuid = UUID.randomUUID();
		String authenticationCode = uuid.toString();
		    AuthenticationCode code = new AuthenticationCode( id, authenticationCode, false, LocalDate.now());
		    this.authenticationCodeDao.save(code);
		    System.out.println("Doğrulama linki " + email + " gönderildi" );
		    System.out.println("Aktivasyon kodu :  " + authenticationCode );
	}

}
