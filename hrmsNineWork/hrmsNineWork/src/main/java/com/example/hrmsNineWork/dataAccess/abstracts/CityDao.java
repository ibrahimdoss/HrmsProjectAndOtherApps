package com.example.hrmsNineWork.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsNineWork.entities.concretes.City;

@Repository
public interface CityDao extends JpaRepository<City, Integer> {
	
	City getById(int id);
}
