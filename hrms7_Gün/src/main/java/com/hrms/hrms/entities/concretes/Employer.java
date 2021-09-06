package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hrms.hrms.entities.abstracts.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = " employers ")
public class Employer extends User{

	@Column(name ="company_name")
	private String companyName;
	
	@Column(name ="website_adress")
	private String websiteAdress;
	
	@Column(name ="company_mail")
	private String company_mail;
	
	@Column(name ="phone_number")
	private String phoneNumber;
}
