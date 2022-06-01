package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Technologies {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String techcode;
	private String technology;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTechcode() {
		return techcode;
	}
	public void setTechcode(String techcode) {
		this.techcode = techcode;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
