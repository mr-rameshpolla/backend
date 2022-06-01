package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class ProjectsTable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String Projects;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getProjects() {
	return Projects;
}
public void setProjects(String projects) {
	Projects = projects;
}
@Override
public String toString() {
	return "ProjectsTable [id=" + id + ", Projects=" + Projects + "]";
}


}
