package com.example.hrmsNineWork.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cv_schools")
public class CvSchool extends Cv{

	@Column(name="name")
	private String schoolName;
	
	@Column(name="department")
	private String department;
	
	@Column(name="start_at")
	private LocalDate startAt;
	
	@Column(name="end_at",nullable=true)
	private LocalDate endAt;
	
	@ManyToOne
	@JoinColumn(name="jobHunter_id")
	private JobHunter jobHunter;
}
