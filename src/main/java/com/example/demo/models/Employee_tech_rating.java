package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Employee_tech_rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	private String empcode;
	private String technology;
	private String rating;
	@ManyToOne
	@JoinColumn(name = "id")
	private Employee employee;
//    @ManyToOne(fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name="employee_rating_id")
//	private Employee emp;
//
//	public Employee getEmp() {
//		return emp;
//	}
//
//	public void setEmp(Employee emp) {
//		this.emp = emp;
//	}

	public String getEmpcode() {
		return empcode;
	}

	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

//	public Employee getId() {
//		return id;
//	}
//
//	public void setId(Employee id) {
//		this.id = id;
//	}

}
