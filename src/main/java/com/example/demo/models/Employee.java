package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employeedetails")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String employeename;
	private String employeecode;
	private String designation;
	private int yearsofexperience;
	private String project;
//	@OneToMany
//	private List<Employee_tech_rating> emptechrating;
//	@OneToMany(fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name = "empcode")
//	private Employee_tech_rating employee_tech_rating;

//	public Employee_tech_rating getEmployee_tech_rating() {
//		return employee_tech_rating;
//	}
//
//	public void setEmployee_tech_rating(Employee_tech_rating employee_tech_rating) {
//		this.employee_tech_rating = employee_tech_rating;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getYearsofexperience() {
		return yearsofexperience;
	}

	public void setYearsofexperience(int yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}

	public String getProject() {
		return project;
	}

	public Employee(long id, String employeecode, String employeename, String designation, int yearsofexperience,
			String project) {
		super();
		this.id = id;
		this.employeecode = employeecode;
		this.employeename = employeename;
		this.designation = designation;
		this.yearsofexperience = yearsofexperience;
		this.project = project;
	}

	public Employee(long id) {
		this.id = id;
	}
	public Employee() {
		
	}

	public void setProject(String project) {
		this.project = project;
	}
	
//	public Employee(Long id) {
//		this.id = id;
//	}

}
