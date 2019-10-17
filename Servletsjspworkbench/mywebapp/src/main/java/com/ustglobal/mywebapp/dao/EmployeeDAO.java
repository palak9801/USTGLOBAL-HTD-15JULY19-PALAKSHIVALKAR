package com.ustglobal.mywebapp.dao;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDAO {

	public EmployeeInfoBean searchEmployee(int id);

	public EmployeeInfoBean addEmployee(EmployeeInfoBean e);

	public boolean updateEmployee(int id, String name, int age, double salary, String designation);

	public boolean deleteEmployee(int id);

	public EmployeeInfoBean login(int empId, String password);
	
	public void registerEmployee(EmployeeInfoBean bean);
	
	public void deleteEmployeee(int id);
}
