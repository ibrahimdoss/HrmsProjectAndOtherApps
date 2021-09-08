package com.example.hrmsNineWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.JobHunter;


@Repository
public interface JobHunterDao  extends JpaRepository<JobHunter, Integer>{
	
	JobHunter getJobHunterByNationalId(String nationalId);
	JobHunter getById(int id);
}
