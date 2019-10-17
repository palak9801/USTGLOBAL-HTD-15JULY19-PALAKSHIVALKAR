package com.ustglobal.manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column
	private int s_id;
	
	@Column
	private String s_name;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Student_Courses", joinColumns  = @JoinColumn(name = "s_id"),
	inverseJoinColumns = @JoinColumn(name = "c_id"))
	private List<Courses> courses;


	public int getS_id() {
		return s_id;
	}


	public void setS_id(int s_id) {
		this.s_id = s_id;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public List<Courses> getCourses() {
		return courses;
	}


	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	
	
	
	
	

}
