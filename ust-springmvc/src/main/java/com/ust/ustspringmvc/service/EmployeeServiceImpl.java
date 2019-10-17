package com.ust.ustspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustspringmvc.dao.EmployeeDAO;
import com.ust.ustspringmvc.dto.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired                    //to make it loosely coupled
	private EmployeeDAO dao;  //as from service we need to access the dao we will create reference variable of dao

	@Override
	public Employee auth(String email, String password) {
		
		return dao.auth(email, password);
	}

	@Override
	public boolean registerEmployee(Employee employee) {
	//to check if the input is null or not..
		if(employee.getName()==null||employee.getEmail()==null||employee.getPassword()==null)
			return false;
			return dao.registerEmployee(employee);
			
		
	}

	@Override
	public boolean deleteEmployee(int id) {
	
		return dao.deleteEmployee(id);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		/*
		 * //to check if updated value is null or not
		 */		
		if(employee.getName()==null||employee.getEmail()==null||employee.getPassword()==null)
	    return false;
		return dao.updateEmployee(employee);
		}

	@Override
	public List<Employee> getAllEmployee() {
	
		return dao.getAllEmployee();
	}
	
	

}
