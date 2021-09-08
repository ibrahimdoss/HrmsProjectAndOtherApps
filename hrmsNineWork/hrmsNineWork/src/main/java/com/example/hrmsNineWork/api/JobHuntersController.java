package com.example.hrmsNineWork.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsNineWork.business.abstracts.JobHunterService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.JobHunter;
import com.example.hrmsNineWork.entities.dtos.CvDto;

@RestController
@RequestMapping("/api/jobhunters")
public class JobHuntersController {

	private JobHunterService jobHunterService;

	@Autowired
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
	
@GetMapping("/getJobHunterCVById")
public DataResult<CvDto> getJobseekerCVById(@RequestParam int id){
	return this.jobHunterService.getJobHunterCVById(id);
}
}
