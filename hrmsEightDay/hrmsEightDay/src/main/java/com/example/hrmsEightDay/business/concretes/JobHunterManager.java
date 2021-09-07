package com.example.hrmsEightDay.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsEightDay.business.abstracts.JobHunterService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.core.utilities.results.SuccessDataResult;
import com.example.hrmsEightDay.core.utilities.results.SuccessResult;
import com.example.hrmsEightDay.dataAccess.abstracts.JobHunterDao;
import com.example.hrmsEightDay.entities.concretes.JobHunter;

@Service
public class JobHunterManager implements JobHunterService {
	
	private JobHunterDao jobHunterDao;
	
	@Autowired
	public JobHunterManager(JobHunterDao jobHunterDao) {
		super();
		this.jobHunterDao = jobHunterDao;
	}

	@Override
	public Result add(JobHunter jobHunter) {
		this.jobHunterDao.save(jobHunter);
		return new SuccessResult("İş Arayan Eklendi");
	}

	@Override
	public DataResult<List<JobHunter>> getAll() {
		return new SuccessDataResult<List<JobHunter>>(this.jobHunterDao.findAll());
	}

	@Override
	public DataResult<JobHunter> getJobHunterByNationalId(String nationalId) {
		return new SuccessDataResult<JobHunter>(this.jobHunterDao.getJobHunterByNationalId(nationalId));
	}
	
	
	
}
