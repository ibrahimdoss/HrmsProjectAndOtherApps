package com.example.hrmsNineWork.entities.concretes;

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
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv_links")
public class CvLink extends Cv {
	
	@Column(name="name")
	private String name;
	
	@Column(name="url")
	private String url;
	
	@ManyToOne()
	@JoinColumn(name="jobHunter_id")
	private JobHunter jobHunter;
}
