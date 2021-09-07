package com.example.hrmsEightDay.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsEightDay.business.abstracts.StafferService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.SuccessDataResult;
import com.example.hrmsEightDay.dataAccess.abstracts.StafferDao;
import com.example.hrmsEightDay.entities.concretes.Staffer;

@Service
public class StafferManager implements StafferService  {
	
	private StafferDao stafferDao;
	
	@Autowired
	public StafferManager(StafferDao stafferDao) {
		super();
		this.stafferDao = stafferDao;
	}

	@Override
	public DataResult<List<Staffer>> getAll() {
		return new SuccessDataResult<List<Staffer>>(this.stafferDao.findAll());
	}
}
