package com.example.hrmsEightDay.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.example.hrmsEightDay.entities.abstracts.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name= " staffers")
@PrimaryKeyJoinColumn(name= "user_id") //primary key user_id
public class Staffer extends User {
	//@Inheritance(strategy = InheritanceType.JOINED) anatasyonu ile extend edilebildi
	
	@Column(name= " first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
}
