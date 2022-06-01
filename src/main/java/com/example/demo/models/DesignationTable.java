package com.example.demo.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DesignationTable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String Designations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignations() {
		return Designations;
	}

	public void setDesignations(String designations) {
		Designations = designations;
	}

	@Override
	public String toString() {
		return "DesignationTable [id=" + id + ", Designations=" + Designations + "]";
	}
//public DesignationTable(Long id, String designations) {
//	super();
//	this.id = id;
//	Designations = designations;
//}
//public DesignationTable() {
//	super();
//	// TODO Auto-generated constructor stub
//}

}
