package com.example.hrmsNineWork.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsNineWork.business.abstracts.CvProgrammingLanguageService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.entities.concretes.CvProgrammingLanguage;

@RestController
@RequestMapping("/api/pLanguagesCvSchool")
public class CvProgrammingLanguagesController {

	private CvProgrammingLanguageService cvProgrammingLanguageService;

	@Autowired
	public CvProgrammingLanguagesController(CvProgrammingLanguageService cvProgrammingLanguageService) {
		super();
		this.cvProgrammingLanguageService = cvProgrammingLanguageService;
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody CvProgrammingLanguage cvProgrammingLanguage){
		return this.cvProgrammingLanguageService.add(cvProgrammingLanguage);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvProgrammingLanguage cvProgrammingLanguage){
		return this.cvProgrammingLanguageService.update(cvProgrammingLanguage);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvProgrammingLanguageService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvProgrammingLanguage> getById(@RequestParam("id") int id){
		return this.cvProgrammingLanguageService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvProgrammingLanguage>> getAll(){
		return this.cvProgrammingLanguageService.getAll();
	}
	
	@GetMapping("/getAllByJobHunterId")
	public DataResult<List<CvProgrammingLanguage>> getAllByJobHunterId(@RequestParam int id){
		return this.cvProgrammingLanguageService.getAllByJobHunterId(id);
	}
}
