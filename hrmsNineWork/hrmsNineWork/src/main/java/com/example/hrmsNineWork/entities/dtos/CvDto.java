package com.example.hrmsNineWork.entities.dtos;

import java.util.List;

import com.example.hrmsNineWork.entities.concretes.CvExperience;
import com.example.hrmsNineWork.entities.concretes.CvForeignLanguage;
import com.example.hrmsNineWork.entities.concretes.CvImage;
import com.example.hrmsNineWork.entities.concretes.CvLink;
import com.example.hrmsNineWork.entities.concretes.CvProgrammingLanguage;
import com.example.hrmsNineWork.entities.concretes.CvSchool;
import com.example.hrmsNineWork.entities.concretes.JobHunter;

public class CvDto {
	
	public JobHunter jobHunter;
	public List<CvSchool> schools;
	public List<CvProgrammingLanguage> pLanguages;
	public List<CvLink> links;
	public List<CvForeignLanguage> languages;
	public List<CvExperience> experiences;
	public CvImage image;
}
