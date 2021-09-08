package com.example.hrmsNineWork.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.PositionService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessDataResult;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.dataAccess.abstracts.PositionDao;
import com.example.hrmsNineWork.entities.concretes.Position;


@Service
public class PositionManager implements PositionService {
	
	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public Result add(Position position) {
		
		this.positionDao.save(position);
		return new SuccessResult(" İş pozisyonu eklendi.");
	}

	@Override
	public DataResult<List<Position>> getAll() {
		
		return new SuccessDataResult<List<Position>>(this.positionDao.findAll());
	}

	@Override
	public DataResult<Position> getPositionByName(String name) {
		
		return new SuccessDataResult<Position>(this.positionDao.getByPositionName(name)," Pozisyon bulundu.");
	}
}
