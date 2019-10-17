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
@Table(name = "Courses" )
public class Courses {
	
	@Id
	@Column
	private int c_id;
	
	@Column
	private String c_name;
	
	//courses accessed from student 
	
	  @ManyToMany(cascade = CascadeType.ALL)
	  
	  @JoinTable(name="Student_Courses", joinColumns = @JoinColumn(name = "c_id"),
	  inverseJoinColumns = @JoinColumn(name = "s_id")) 
	  private List<Courses>courses;
	 

	
	  public List<Courses> getCourses() { return courses; }
	  
	  public void setCourses(List<Courses> courses) { this.courses = courses; }
	 
	
	/*
	 * //to access student from courses
	 * 
	 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses") private
	 * List<Student> student;
	 * 
	 * public List<Student> getStudent() { return student; }
	 * 
	 * public void setStudent(List<Student> student) { this.student = student; }
	 */

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	
	
	

}
