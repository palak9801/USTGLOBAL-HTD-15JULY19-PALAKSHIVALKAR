package com.ust.ustspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.ustspringboot.dto.Employee;

//@Repository
public class EmployeeDAOImpl  implements EmployeeDAO{

	//@PersistenceUnit
	 private EntityManagerFactory factory;
	 
	@Override
	public boolean addEmployee(Employee employee) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(employee);
			transaction.commit();
			return  true;
		} catch (Exception e) {
			return false;
			
		}
		
		
	}

	@Override
	public boolean removeEmployee(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			Employee employee = manager.find(Employee.class, id);
			manager.remove(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
			}
		
	
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee emp = manager.find(Employee.class, employee.getId());
		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());
		transaction.commit();
		
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
	return manager.find(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "from Employee";
		Query query = manager.createQuery(jpql);
		List<Employee> emp = (List<Employee>) query.getResultList();
		return emp;
		
		
	}

}
