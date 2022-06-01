package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee_tech_ratingTO;
import com.example.demo.dto.UserRatingDto;
import com.example.demo.models.DesignationTable;
import com.example.demo.models.Employee;
import com.example.demo.models.ProjectsTable;
import com.example.demo.models.Technologies;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class EmployeeController  {
	@Autowired
	private EmployeeService empservice;
	
	

	
	
	//EmployeesGetMethod
    @GetMapping( "/getEmployees")
    public List<Employee> getAllUsers() {
        return empservice.getallusers();
    }
       
    
    //EmployeesPostMethod
	    @PostMapping(path = "/addemployees")
	    public Map<String, String> addUser(@RequestBody Employee emp) {
		   return empservice.addUser(emp);
	    } 
	   
     //TechnologyPostMethod    

//	    @PostMapping(path = "/addtechnologies")
//	    public Map<String, String> addtechnoandrating(@RequestBody Technologies techs) {
//		  return empservice.addtechnoandrating(techs);
//	    }  
      //TechnologyGetmethod 
	   @GetMapping("/")
	   public List<Technologies> getTechs(){
		  return empservice.getTechs();
	   }
	   
       // EmployeeTechRatingRepoPostMethod 
	   @PostMapping(path = "/addtechnologiesrating")
	    public boolean addtechnoandrating(@RequestBody List<Employee_tech_ratingTO> emps) {
           return empservice.addtechnoandrating(emps);
	   } 
	   
	
	   @GetMapping("/designation")
		public List<DesignationTable> getRoles(){
			return empservice.getRoles();
		}
	
	   @GetMapping("/projects")
	   public List<ProjectsTable> getProjects(){
		   return empservice.getProjects();
	   }
	   
	   
	   //admin-page-getmapping 
	   @GetMapping("/usersrating")
	   public List<UserRatingDto> getallusers(){
		   return empservice.getalldetails();
	   }
	  
	   @GetMapping("/userid/{abc}") 
	   public Employee getuserid(@PathVariable("abc") String abc) {
		   return empservice.getuserid(abc);
	   }
	
}
