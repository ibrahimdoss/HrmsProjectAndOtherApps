package com.example.hrmsNineWork.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.AuthenticationService;
import com.example.hrmsNineWork.business.abstracts.EmployerService;
import com.example.hrmsNineWork.business.abstracts.JobHunterService;
import com.example.hrmsNineWork.business.abstracts.UserService;
import com.example.hrmsNineWork.business.abstracts.VerificationCodeService;
import com.example.hrmsNineWork.core.utilities.adapters.MernisService;
import com.example.hrmsNineWork.core.utilities.results.ErrorResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.core.verification.VerificationService;
import com.example.hrmsNineWork.entities.concretes.AuthenticationCode;
import com.example.hrmsNineWork.entities.concretes.Employer;
import com.example.hrmsNineWork.entities.concretes.JobHunter;

@Service
public class AuthenticationManager implements AuthenticationService{
	private UserService userService;
	private EmployerService employerService;
	private JobHunterService jobHunterService;
	private VerificationService verificationService;
	private MernisService mernisService;
	private VerificationCodeService verificationCodeService;

	
	@Autowired
	public AuthenticationManager(UserService userService, EmployerService employerService, JobHunterService jobHunterService,
			 VerificationService verificationService, MernisService mernisService,
			VerificationCodeService verificationCodeService) {
		super();
		this.userService = userService;
		this.employerService = employerService;
		this.jobHunterService = jobHunterService;
		this.verificationService = verificationService;
		this.mernisService = mernisService;
		this.verificationCodeService = verificationCodeService;
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
		String code = verificationService.sendCode();
		verificationCodeRecord(code, employer.getId(), employer.getEmail());
		return new SuccessResult("Kayıt başarıyla tamamlandı");

	}

	@Override
	public Result registerJobHunter(JobHunter jobHunter, String confirmPassword) {

		
			
			if (checkIfRealPerson(jobHunter.getNationalId(), jobHunter.getFirstName(),
					jobHunter.getLastName(), jobHunter.getDateOfBirth().getYear()) == false) {
				return new ErrorResult("TC doğrulanamadı.");
			}

			if (!checkIfNullInfoForJobHunter(jobHunter, confirmPassword)) {

				return new ErrorResult("Lütfen boş alanları doldurun.");
			}

			if (!checkIfExistsTcNo(jobHunter.getNationalId())) {

				return new ErrorResult(jobHunter.getNationalId() + " zaten var.");
			}

			if (!checkIfEmailExists(jobHunter.getEmail())) {

				return new ErrorResult(jobHunter.getEmail() + " zaten var");
			}

		
		jobHunterService.add(jobHunter);
		String code = verificationService.sendCode();
		verificationCodeRecord(code, jobHunter.getId(), jobHunter.getEmail());
		return new SuccessResult("Kayıt başarıyla tamamlandı");
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

	private boolean checkIfRealPerson(String nationalId, String firstName, String lastName, int yearOfBirth) {

		if (mernisService.userİnformationValidation(nationalId, firstName, lastName, yearOfBirth)) {
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
	
	private void verificationCodeRecord(String code, int id, String email) {
		
		AuthenticationCode authenticationCode = new AuthenticationCode(id, code, false);
		this.verificationCodeService.add(authenticationCode);
		System.out.println("Doğrulama : " + email +" e gönderildi." );
		
	
	
	}
}	
