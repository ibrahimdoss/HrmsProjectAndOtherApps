package com.example.hrmsNineWork.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.CvProgrammingLanguage;

@Repository
public interface CvProgrammingLanguageDao  extends JpaRepository<CvProgrammingLanguage, Integer>{
	
	CvProgrammingLanguage getById(int id);
	List<CvProgrammingLanguage> getAllByJobHunter_id(int id );
}
