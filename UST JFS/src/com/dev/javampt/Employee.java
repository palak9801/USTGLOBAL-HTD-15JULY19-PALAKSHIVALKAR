package com.dev.javampt;

public class Employee {
	
	private int emp_id;
	private String ename;
	private String email;
	private String password;
	private double Salary;
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", ename=" + ename + ", email=" + email 
				+ ", Salary=" + Salary + "]";
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}

}
