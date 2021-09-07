package com.example.hrmsEightDay.business.abstracts;

import java.util.List;

import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.entities.concretes.Staffer;

public interface StafferService {
	
	DataResult<List<Staffer>> getAll();
}
