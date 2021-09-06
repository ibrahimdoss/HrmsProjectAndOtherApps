package com.hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.PositionService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Position;

@RestController
@RequestMapping("/api/position")
public class PositionController {

	
	private PositionService positionService;
	
	@Autowired
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Position>> getAll(){
		return this.positionService.getAll();
	}
	
	@PostMapping("/addposition")
	public Result addJob(@RequestBody Position position) {
		return positionService.addPosition(position);
	}
}
