package com.example.hrmsNineWork.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.CvExperience;

@Repository
public interface CvExperienceDao extends JpaRepository<CvExperience, Integer>{
	
	CvExperience getById(int id);
	
	List<CvExperience> getAllByJobHunter_idOrderByEndAtDesc(int id);
	List<CvExperience> getAllByJobHunter_id(int id);
}
