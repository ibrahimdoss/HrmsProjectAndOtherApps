package com.example.hrmsNineWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.CvCoverLetter;

@Repository
public interface CvCoverLetterDao extends JpaRepository<CvCoverLetter, Integer>{
	
	CvCoverLetter getById(int id);
}
