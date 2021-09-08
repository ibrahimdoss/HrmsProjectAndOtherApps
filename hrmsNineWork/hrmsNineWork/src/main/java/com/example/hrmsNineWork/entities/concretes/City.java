package com.example.hrmsNineWork.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer", " handler", " jobAdverts"})

public class City extends Cv {
	
	@Column(name=" name")
	private String name;
	
	@OneToMany(mappedBy = "city")
	private List<JobAdvert> jobAdverts;
	
	
	public City(String name, List<JobAdvert> jobAdverts) {
		super();
		this.name=name;
		this.jobAdverts=jobAdverts;
	}
}
