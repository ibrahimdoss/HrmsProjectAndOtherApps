package com.example.hrmsNineWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.CvImage;

@Repository
public interface CvImageDao extends JpaRepository<CvImage, Integer> {
	
	CvImage getById(int id);
	CvImage getByJobHunter_id(int id);
}
