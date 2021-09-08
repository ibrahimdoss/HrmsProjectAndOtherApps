package com.example.hrmsNineWork.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= " users")
@Inheritance(strategy = InheritanceType.JOINED) //base class // her sınıf kendi tablosuna eşlenir.
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate created_at = LocalDate.now();
	
	@Column(name="is_active", columnDefinition = "boolean default true")
	private boolean isActived= true;
	
	@Column(name="is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted= false;
}
