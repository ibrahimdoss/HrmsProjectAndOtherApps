package com.example.hrmsNineWork.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name="cv_images")
public class CvImage extends Cv {
	
	@Column(name="url")
	private String url;
	
	@OneToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="jobHunter_id", referencedColumnName = "user_id")
	private JobHunter jobHunter;
}	
