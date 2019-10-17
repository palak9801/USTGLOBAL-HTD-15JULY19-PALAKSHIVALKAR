package com.ust.ustspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ust.ustspringmvc.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@PersistenceUnit    //orm annotation instead of autowired
	private EntityManagerFactory factory;
	

	@Override
	public Employee auth(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		
		String jpql = "from Employee where email=:email and password=:pwd";
		Query query =  manager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", password);
		try {
		return (Employee) query.getSingleResult();
		}catch(Exception e) {
			return null;
		}
		
	}

	@Override
	public boolean registerEmployee(Employee employee) {
	   if(checkEmail(employee.getEmail()))
	   {
		   return false;
	   }
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		
		return true;
	}
	//it is used in this class only therefore we will take it as private
	private boolean checkEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Employee where email=:email";
		Query query =  manager.createQuery(jpql);
		
		query.setParameter("email", email);
		try {
		Employee employee = (Employee) query.getSingleResult();
		return true;
		
		}catch(Exception e) {
			return false;
		}
		
		
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee employee = manager.find(Employee.class, id);
		if(employee == null) {
			return false;
		}
		manager.remove(employee);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee emp = manager.find(Employee.class, employee.getId());
		if(emp == null) {
			return false;
		}
		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());
		transaction.commit();
		
		
		return true;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		EntityManager manager = factory.createEntityManager();
		@SuppressWarnings("unused")
		EntityTransaction transaction = manager.getTransaction();
		
		String jpql = "from Employee";
		Query query = manager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
