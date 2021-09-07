package com.example.hrmsEightDay.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.example.hrmsEightDay.entities.abstracts.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = " jobhunters")
@PrimaryKeyJoinColumn(name = " user_id")
public class JobHunter extends User {
	
	@Column(name= " first_name")
	private String firstName;
	
	@Column(name = " last_name")
	private String lastName;
	
	@Column(name = " national_id")
	private String nationalId;
	
	@Column(name = "date_of_birth ")
	private LocalDate dateOfBirth;
	
	@Column(name="is_verified", columnDefinition = "boolean default false")
	private boolean isVerified= false ;
	
	
	
}
