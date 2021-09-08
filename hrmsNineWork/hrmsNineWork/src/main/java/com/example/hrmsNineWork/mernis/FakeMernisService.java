package com.example.hrmsNineWork.mernis;

public class FakeMernisService {
	
	public boolean ValidateByPersonalInfo(String identityNumber, String firstName, String lastName, int birthYear)
	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}
	
}
