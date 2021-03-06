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
@Table(name = " system_personnel")
public class SystemPersonnel extends User {

	
	@Column(name = " position_name")
	private String positionName;
	
	@Column(name = " first_name")
	private String firstName;
	
	@Column(name = " last_name")
	private String lastName;
}
