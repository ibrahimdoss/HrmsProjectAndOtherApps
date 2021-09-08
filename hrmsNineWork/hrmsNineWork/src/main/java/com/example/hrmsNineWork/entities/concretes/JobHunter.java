package com.example.hrmsNineWork.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Table(name= " jobhunters")
@PrimaryKeyJoinColumn(name="user_id")
public class JobHunter extends User {
	
	@Column(name= " first_name")
	private String firstName;
	
	@Column(name=" last_name")
	private String lastName;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified= false;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobHunter")
	private List<CvSchool> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobHunter")
	private List<CvProgrammingLanguage> pLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobHunter")
	private List<CvLink> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobHunter")
	private List<CvForeignLanguage> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobHunter")
	private List<CvExperience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobHunter")
	private List<CvCoverLetter> coverLetters;
	
	@JsonIgnore
	@OneToOne(mappedBy = "jobHunter", optional=false, fetch=FetchType.LAZY)
	private CvImage image;
}
