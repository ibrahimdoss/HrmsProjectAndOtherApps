package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.Position;

public interface PositionDao  extends JpaRepository<Position, Integer>{

}
