package com.example.hrmsNineWork.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsNineWork.business.abstracts.CvSchoolService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvSchool;

@RestController
@RequestMapping("/api/schools")
public class CvSchoolsController {
	private CvSchoolService cvSchoolService;
    
	@Autowired
	public CvSchoolsController(CvSchoolService cvSchoolService) {
		super();
		this.cvSchoolService = cvSchoolService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvSchool cvSchool){
		return this.cvSchoolService.add(cvSchool);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvSchool cvSchool){
		return this.cvSchoolService.update(cvSchool);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.cvSchoolService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvSchool> getById(@RequestParam int id){
		return this.cvSchoolService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvSchool>> getAll(){
		return this.cvSchoolService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<CvSchool>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam int id){
		return this.cvSchoolService.getAllByJobHunterIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvSchool>> getAllByJobseekerId(@RequestParam int id){
		return this.cvSchoolService.getAllByJobHunterId(id);
	}
}
