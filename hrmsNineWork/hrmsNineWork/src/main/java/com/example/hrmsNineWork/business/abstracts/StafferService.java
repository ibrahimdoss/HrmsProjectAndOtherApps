package com.example.hrmsNineWork.business.abstracts;

import java.util.List;

import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.entities.concretes.Staffer;

public interface StafferService {
	
	DataResult<List<Staffer>> getAll();
}
