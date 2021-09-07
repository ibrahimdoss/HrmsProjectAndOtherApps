package com.example.hrmsEightDay.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsEightDay.entities.concretes.AuthenticationCode;

@Repository
public interface AuthenticationCodeDao extends JpaRepository<AuthenticationCode, Integer> {

}
