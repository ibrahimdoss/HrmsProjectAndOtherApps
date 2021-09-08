package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.Position;

public interface PositionService {
	
	Result add(Position position);
	
	DataResult<List<Position>> getAll();
	
	DataResult<Position> getPositionByName(String name);
}
