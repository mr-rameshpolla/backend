package com.example.demo.dto;
import com.example.demo.models.Employee;

import lombok.Data;

@Data
public class Employee_tech_ratingTO {

	private long eid;
	private String empcode;
	private String technology;
	private String rating;
	private Employee employee;
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEmpcode() {
		return empcode;
	}
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
//	public Employee getId() {
//		return id;
//	}
//	public void setId(Employee id) {
//		this.id = id;
//	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
