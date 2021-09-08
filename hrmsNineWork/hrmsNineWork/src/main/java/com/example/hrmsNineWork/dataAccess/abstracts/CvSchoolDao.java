package com.example.hrmsNineWork.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrmsNineWork.entities.concretes.CvSchool;

public interface CvSchoolDao extends JpaRepository<CvSchool, Integer>{
	
	CvSchool getById(int id);
	
	List<CvSchool> getAllByJobHunter_idOrderByEndAtDesc(int id);
	List<CvSchool> getAllByJobHunter_id(int id );
}
