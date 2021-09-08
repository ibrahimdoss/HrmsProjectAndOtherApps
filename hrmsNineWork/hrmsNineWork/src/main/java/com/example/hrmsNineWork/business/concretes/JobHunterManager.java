package com.example.hrmsNineWork.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.CvExperienceService;
import com.example.hrmsNineWork.business.abstracts.CvForeignLanguageService;
import com.example.hrmsNineWork.business.abstracts.CvImageService;
import com.example.hrmsNineWork.business.abstracts.CvLinkService;
import com.example.hrmsNineWork.business.abstracts.CvProgrammingLanguageService;
import com.example.hrmsNineWork.business.abstracts.CvSchoolService;
import com.example.hrmsNineWork.business.abstracts.JobHunterService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessDataResult;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.dataAccess.abstracts.JobHunterDao;
import com.example.hrmsNineWork.entities.concretes.JobHunter;
import com.example.hrmsNineWork.entities.dtos.CvDto;


@Service
public class JobHunterManager implements JobHunterService{
	
	private JobHunterDao jobHunterDao;
	private CvExperienceService cvExperienceService;
	private CvForeignLanguageService cvForeignLanguageService;
	private CvImageService cvImageService;
	private CvLinkService cvLinkService;
	private CvProgrammingLanguageService cvProgrammingLanguageService;
	private CvSchoolService cvSchoolService;

	public JobHunterManager(JobHunterDao jobHunterDao, CvExperienceService cvExperienceService,
			CvForeignLanguageService cvForeignLanguageService, CvImageService cvImageService,
			CvLinkService cvLinkService, CvProgrammingLanguageService cvProgrammingLanguageService,
			CvSchoolService cvSchoolService) {
		super();
		this.jobHunterDao = jobHunterDao;
		this.cvExperienceService = cvExperienceService;
		this.cvForeignLanguageService = cvForeignLanguageService;
		this.cvImageService = cvImageService;
		this.cvLinkService = cvLinkService;
		this.cvProgrammingLanguageService = cvProgrammingLanguageService;
		this.cvSchoolService = cvSchoolService;
	}

	@Override
	public Result add(JobHunter jobHunter) {
		this.jobHunterDao.save(jobHunter);
		return new SuccessResult("Jobseeker has been added.");
	}

	@Override
	public Result update(JobHunter jobHunter) {
		this.jobHunterDao.save(jobHunter);
		return new SuccessResult("Jobseeker has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobHunterDao.deleteById(id);
		return new SuccessResult("Jobseeker has been deleted.");
	}

	@Override
	public DataResult<JobHunter> getById(int id) {
		return new SuccessDataResult<JobHunter>(this.jobHunterDao.getById(id));
	}

	@Override
	public DataResult<List<JobHunter>> getAll() {
		return new SuccessDataResult<List<JobHunter>>(this.jobHunterDao.findAll());
	}

	@Override
	public DataResult<JobHunter> getJobHunterByNationalId(String nationalId) {
		return new SuccessDataResult<JobHunter>(this.jobHunterDao.getJobHunterByNationalId(nationalId));
	}

	@Override
	public DataResult<CvDto> getJobHunterCVById(int id) {
		JobHunter jobHunter = this.jobHunterDao.getById(id);
		CvDto cv = new CvDto();
		cv.experiences = jobHunter.getExperiences();
		cv.languages = jobHunter.getLanguages();
		cv.image = jobHunter.getImage();
		cv.links = jobHunter.getLinks();
		cv.pLanguages = jobHunter.getPLanguages();
		cv.schools = jobHunter.getSchools();
		return new SuccessDataResult<CvDto>(cv);
	}
}
