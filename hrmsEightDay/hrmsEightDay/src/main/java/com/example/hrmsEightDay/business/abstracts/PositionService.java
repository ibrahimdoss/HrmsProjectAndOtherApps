package com.example.hrmsEightDay.business.abstracts;

import java.util.List;

import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.entities.concretes.Position;

public interface PositionService {
	
	Result add(Position position);
	
	DataResult<List<Position>> getAll();
	
	DataResult<Position> getPositionByName(String name);
}
