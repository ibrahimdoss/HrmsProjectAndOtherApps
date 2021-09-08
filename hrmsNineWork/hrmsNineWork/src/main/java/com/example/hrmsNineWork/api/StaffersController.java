package com.example.hrmsNineWork.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsNineWork.business.abstracts.StafferService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.entities.concretes.Staffer;

@RestController
@RequestMapping("/api/staffers")
public class StaffersController {

	private StafferService stafferService;

	@Autowired
	public StaffersController(StafferService stafferService) {
		super();
		this.stafferService = stafferService;
	}
	
	
@GetMapping("/getall")
public DataResult<List<Staffer>> getAll(){
	
	return this.stafferService.getAll();
	
}
}
