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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = " positions")
public class Position {
	
	@Id
	@GeneratedValue
	@Column(name = " id")
	private int id;
	
	@Column(name = "position_name")
	private String positionName;
	
	@Column(name="created_date", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();
	
	@Column(name="is_actived", columnDefinition = "boolean default true")
	private boolean isActived= true;
	
	@Column(name="is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted= false;
}
