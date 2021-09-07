package com.example.hrmsEightDay.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsEightDay.business.abstracts.PositionService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.entities.concretes.Position;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {
	
	private PositionService positionService;

	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Position position) {
		return this.positionService.add(position);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Position>> getAll(){
		return this.positionService.getAll();
	}

}
