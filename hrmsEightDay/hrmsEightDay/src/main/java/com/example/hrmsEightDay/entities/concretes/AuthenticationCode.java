package com.example.hrmsEightDay.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = " authentication_codes")
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationCode {
	
	@Id
	@GeneratedValue
	@Column(name = "id ")
	private int id;
	
	@Column(name= " user_id")
	private int userId;
	
	@Column(name = " code" )
	private String verificationCode;
	
	@Column(name= " is_confirmed")
	private boolean isConfirmed;
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createdAt= LocalDate.now();
	
	public AuthenticationCode(int userId, String verificationCode, boolean isConfirmed, LocalDate createdAt) {
		super();
		this.userId = userId;
		this.verificationCode = verificationCode;
		this.isConfirmed = isConfirmed;
		this.createdAt = createdAt;
	}
	
	
	
}
