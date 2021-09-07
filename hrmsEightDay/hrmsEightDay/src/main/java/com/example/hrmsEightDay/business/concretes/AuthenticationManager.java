package com.example.hrmsEightDay.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsEightDay.business.abstracts.AuthenticationService;
import com.example.hrmsEightDay.business.abstracts.EmployerService;
import com.example.hrmsEightDay.business.abstracts.JobHunterService;
import com.example.hrmsEightDay.business.abstracts.UserService;
import com.example.hrmsEightDay.core.utilities.adapters.MernisService;
import com.example.hrmsEightDay.core.utilities.results.ErrorResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.core.utilities.results.SuccessResult;
import com.example.hrmsEightDay.core.verification.VerificationService;
import com.example.hrmsEightDay.entities.concretes.Employer;
import com.example.hrmsEightDay.entities.concretes.JobHunter;

@Service
public class AuthenticationManager implements AuthenticationService {
	

	private UserService userService;
	private EmployerService employerService;
	private JobHunterService jobHunterService;
	private VerificationService verificationService;
	private MernisService mernisService;
	
	@Autowired
	public AuthenticationManager(UserService userService, EmployerService employerService,
			JobHunterService jobHunterService, VerificationService verificationService, MernisService mernisService) {
		super();
		this.userService = userService;
		this.employerService = employerService;
		this.jobHunterService = jobHunterService;
		this.verificationService = verificationService;
		this.mernisService = mernisService;
	}

	@Override
	public Result registerEmployer(Employer employer, String confirmPassword) {
		if (!checkIfNullInfoForEmployer(employer)) {

			return new ErrorResult("Lütfen boş alanları doldurun.");
		}

		if (!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebSite())) {

			return new ErrorResult("Geçersiz email adresi.");
		}

		if (!checkIfEmailExists(employer.getEmail())) {

			return new ErrorResult(employer.getEmail() + " zaten var.");
		}

		if (!checkIfEqualPasswordAndConfirmPassword(employer.getPassword(), confirmPassword)) {

			return new ErrorResult("parola eşleşmiyor.");
		}
		
		employerService.add(employer);
		verificationService.sendCode(employer.getEmail(), employer.getId());
		return new SuccessResult("Kayıt Başarıyla Tamamlandı");
	}

	@Override
	public Result registerJobHunter(JobHunter jobHunter, String confirmPassword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	private boolean checkIfNullInfoForEmployer(Employer employer) {
		if (employer.getCompanyName() != null && employer.getWebSite() != null && employer.getEmail() != null
				&& employer.getPhoneNumber() != null && employer.getPassword() != null) {

			return true;

		}

		return false;
	}
	
	
	private boolean checkIfEqualEmailAndDomain(String email, String website) {
		String[] emailArr = email.split("@", 2);
		String domain = website.substring(4, website.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;
	}
	
	
	private boolean checkIfNullInfoForJobHunter(JobHunter jobHunter, String confirmPassword) {
		if (jobHunter.getFirstName() != null && jobHunter.getLastName() != null && jobHunter.getNationalId() != null
				&& jobHunter.getDateOfBirth() != null && jobHunter.getPassword() != null && jobHunter.getEmail() != null
				&& confirmPassword != null) {

			return true;

		}

		return false;
	}
	
	
	private boolean checkIfExistsTcNo(String nationalId) {

		if (this.jobHunterService.getJobHunterByNationalId(nationalId).getData() == null) {
			return true;
		}
		return false;
	}
	
	
	private boolean checkIfRealPerson(String nationalId, String firstName, String lastName, int birthYear) {

		if (mernisService.userİnformationValidation(nationalId, firstName, lastName,  birthYear )) {
			return true;
		}
		return false;
	}
	
	

	private boolean checkIfEmailExists(String email) {

		if (this.userService.getUserByEmail(email).getData() == null) {

			return true;
		}

		return false;
	}
	
	
	private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {

		if (!password.equals(confirmPassword)) {
			return false;
		}

		return true;
	}
	
	
	
	
	
	
	
	
	
	
}
