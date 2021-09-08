package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.entities.concretes.City;

public interface CityService {
	
	
	DataResult<List<City>> getAll();
}
