package com.honest.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	//private String name;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
