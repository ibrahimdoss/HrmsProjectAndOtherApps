package com.hrms.hrms.business.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.PositionService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.PositionDao;
import com.hrms.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService {

	private PositionDao positionDao;
	
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}


	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>(positionDao.findAll(),"İş Pozisyonları Listelendi");
	}


	@Override
	public Result addPosition(Position position) {
		positionDao.save(position);
		return new SuccessResult("Yeni iş pozisyonu eklendi");
	}



	

}
