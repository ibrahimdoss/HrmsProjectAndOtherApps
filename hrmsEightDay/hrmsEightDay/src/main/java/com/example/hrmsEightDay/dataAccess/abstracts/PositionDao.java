package com.example.hrmsEightDay.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsEightDay.entities.concretes.Position;

@Repository
public interface PositionDao extends JpaRepository<Position, Integer> {
	
	Position getByPositionName(String name);
}
