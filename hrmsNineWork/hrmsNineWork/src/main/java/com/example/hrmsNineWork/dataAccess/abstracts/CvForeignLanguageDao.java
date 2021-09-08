package com.example.hrmsNineWork.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.CvForeignLanguage;

@Repository
public interface CvForeignLanguageDao  extends JpaRepository<CvForeignLanguage, Integer>{
	
	CvForeignLanguage getById(int id);
	List<CvForeignLanguage> getAllByJobHunter_id(int id);
}
