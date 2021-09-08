package com.example.hrmsNineWork.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.CvLink;

@Repository
public interface CvLinkDao extends JpaRepository<CvLink, Integer>{
	
	CvLink getById(int id);
	List<CvLink> getAllByJobHunter_id(int id );
}
