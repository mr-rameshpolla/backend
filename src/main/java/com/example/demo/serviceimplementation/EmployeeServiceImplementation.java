package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Employee_tech_ratingTO;
import com.example.demo.dto.UserRatingDto;
import com.example.demo.models.DesignationTable;
import com.example.demo.models.Employee;
import com.example.demo.models.Employee_tech_rating;
import com.example.demo.models.ProjectsTable;
import com.example.demo.models.Technologies;
import com.example.demo.repository.DesignationRepo;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeTechRatingRepo;
import com.example.demo.repository.ProjectsRepo;
import com.example.demo.repository.TechnologiesRepo;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeerepo;
	
	@Autowired
	private TechnologiesRepo techrepo; 
	
	@Autowired
	private EmployeeTechRatingRepo emptechrepo;
	
	@Autowired
	private DesignationRepo designrepo;

	@Autowired
	private ProjectsRepo proRepo; 
	
	@Override
	public List<Employee> getallusers() {
		List<Employee> fields = new ArrayList<>();
        employeerepo.findAll().forEach(fields::add);
        return fields;
	}

	@Override
	public Map<String, String> addUser(Employee emp) {
		employeerepo.save(emp);
		   Map<String,String> response = new HashMap<String,String>(); 
		   response.put("ok", "Saved");
	       return response;
	}

//	@Override
//	public Map<String, String> addtechnoandrating(Technologies techs) {
//		// TODO Auto-generated method stub
//		 techrepo.save(techs);
//		   Map<String,String> response = new HashMap<String,String>(); 
//		   response.put("ok", "Saved");
//	       return response;
//	}

	@Override
	public List<Technologies> getTechs() {
		// TODO Auto-generated method stub
		 return techrepo.findAll();
	}

	@Override
	public boolean addtechnoandrating(List<Employee_tech_ratingTO> emps) {
		   try{
		        for(Employee_tech_ratingTO emp : emps){
		        	Employee_tech_rating data = new Employee_tech_rating();
		        	data.setEmpcode(emp.getEmpcode());
		        	data.setEmployee(new Employee(emp.getEmployee().getId()));
		        	data.setRating(emp.getRating());
		        	data.setTechnology(emp.getTechnology());
		        	emptechrepo.save(data);
		        }
		        return true;
		    }catch(Exception e){}
		   return false;
	    }

	@Override
	public List<DesignationTable> getRoles() {
		// TODO Auto-generated method stub
		return designrepo.findAll();
	}

	@Override
	public List<ProjectsTable> getProjects() {
		// TODO Auto-generated method stub
		return proRepo.findAll();
	}

	@Override
	public List<UserRatingDto> getalldetails() {
		List<UserRatingDto>  ListOfDetails = new ArrayList<>();
		//return emptechrepo.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
		try {
			List<Employee_tech_rating> employeeDetails = emptechrepo.findAll();
			if(employeeDetails!=null) {
				for(Employee_tech_rating data : employeeDetails) {
					UserRatingDto ratingTO = new UserRatingDto();
					ratingTO.setEmployeecode(data.getEmpcode());
					ratingTO.setTechnology(data.getTechnology());
					ratingTO.setEmployeename(data.getEmployee().getEmployeename());
					ratingTO.setDesignation(data.getEmployee().getDesignation());
					ratingTO.setProject(data.getEmployee().getProject());
					ListOfDetails.add(ratingTO);	
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ListOfDetails;
	}

	@Override
	public UserRatingDto convertEntityToDto(Employee_tech_rating emprating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getuserid(String abc) {
		// TODO Auto-generated method stub
		 
		return employeerepo.findByEmployeecode(abc);
	}

//	@Override
//	public boolean addtechnoandrating(List<Employee_tech_ratingTO> emps) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public UserRatingDto convertEntityToDto(Employee_tech_rating emprating) {
//		UserRatingDto userratingdto = new UserRatingDto(); 
//		userratingdto.setEmployeecode(emprating.getEmp().getEmployeecode()); 
//		userratingdto.setEmployeename(emprating.getEmp().getEmployeename()); 
//		userratingdto.setProject(emprating.getEmp().getProject()); 
//		userratingdto.setDesignation(emprating.getEmp().getDesignation());
//		userratingdto.setTechnology(emprating.getTechnology()); 
//		return userratingdto;
//		
//	}

//	@Override
//	public UserRatingDto convertEntityToDto(EmployeeTechRating emptechrating) {
//		UserRatingDto userratingdto = new UserRatingDto(); 
//		userratingdto.setEmployeecode(emptechrating.getEmployeecode()); 
//		userratingdto.setEmployeename(emptechrating.getEmployeename()); 
//		userratingdto.setDesignation(emptechrating.getDesignation()); 
//		userratingdto.setTechnology(); 
//		userratingdto.setProject(emp.getProject()); 
//		return userratingdto;
//	
//	} 
//	   
	
}
