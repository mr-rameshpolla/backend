package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.Employee_tech_ratingTO;
import com.example.demo.dto.UserRatingDto;
import com.example.demo.models.DesignationTable;
import com.example.demo.models.Employee;
import com.example.demo.models.Employee_tech_rating;
import com.example.demo.models.ProjectsTable;
import com.example.demo.models.Technologies;

public interface EmployeeService {

	public List<Employee> getallusers();
	
	public Map<String,String> addUser(Employee emp);
	
//	public Map<String,String> addtechnoandrating(Technologies techs);
	
	public List<Technologies> getTechs();
	
	public boolean addtechnoandrating(List<Employee_tech_ratingTO> emps);

	public List<DesignationTable> getRoles();

	public List<ProjectsTable> getProjects(); 
	
	public List<UserRatingDto> getalldetails();
	
	public UserRatingDto convertEntityToDto(Employee_tech_rating emprating); 
	
	public Employee getuserid(String abc);
}

