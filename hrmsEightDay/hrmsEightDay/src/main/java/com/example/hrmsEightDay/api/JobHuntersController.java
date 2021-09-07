package com.example.hrmsEightDay.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsEightDay.business.abstracts.JobHunterService;
import com.example.hrmsEightDay.core.utilities.results.DataResult;
import com.example.hrmsEightDay.core.utilities.results.Result;
import com.example.hrmsEightDay.entities.concretes.JobHunter;

@RestController
@RequestMapping("/api/jobhunters")
public class JobHuntersController {
	
	private JobHunterService jobHunterService;

	public JobHuntersController(JobHunterService jobHunterService) {
		super();
		this.jobHunterService = jobHunterService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobHunter jobHunter) {
		return this.jobHunterService.add(jobHunter);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobHunter>> getAll(){
		return this.jobHunterService.getAll();
	}
}
