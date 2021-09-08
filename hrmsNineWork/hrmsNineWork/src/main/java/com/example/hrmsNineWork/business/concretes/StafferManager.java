package com.example.hrmsNineWork.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.StafferService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.SuccessDataResult;
import com.example.hrmsNineWork.dataAccess.abstracts.StafferDao;
import com.example.hrmsNineWork.entities.concretes.Staffer;

@Service
public class StafferManager implements StafferService{
	
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
