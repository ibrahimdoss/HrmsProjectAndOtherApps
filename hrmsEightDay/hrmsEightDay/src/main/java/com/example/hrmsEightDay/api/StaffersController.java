package com.example.hrmsEightDay.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsEightDay.business.abstracts.StafferService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.entities.concretes.Staffer;

@RestController
@RequestMapping("/api/staffers")
public class StaffersController {
	
	
	private StafferService stafferService;

	public StaffersController(StafferService stafferService) {
		super();
		this.stafferService = stafferService;
	}
	
	@GetMapping("/add")
	public DataResult<List<Staffer>> getAll(){
		return this.stafferService.getAll();
	}
	
}
