package com.ustglobal.mywebapp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public EmployeeInfoBean searchEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = emf.createEntityManager();

		EmployeeInfoBean employeeInfoBean = null;
		try {

			employeeInfoBean = manager.find(EmployeeInfoBean.class, id);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean login(int empId, String password) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = emf.createEntityManager();

		EmployeeInfoBean employeeInfoBean = null;
		String jpql = "from EmployeeInfoBean where emp_id =:id and password =:pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("id", empId);
		query.setParameter("pwd", password);

		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean addEmployee(EmployeeInfoBean e) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = null;
		
		EmployeeInfoBean employeeInfoBean = null;

		try {
			transaction = manager.getTransaction();
			transaction.begin();
			
			e.setEmpId(e.getEmpId());
			e.setEmpName(e.getEmpName());
			e.setAge(e.getAge());
			e.setSalary(e.getSalary());
			e.setDesignation(e.getDesignation());
			manager.persist(e);
			System.out.println("Data Inserted");
			transaction.commit();
		} catch (Exception ee) {

			ee.printStackTrace();
		}
		return e;
	

	}

	@Override
	public boolean deleteEmployee(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = null;

		EmployeeInfoBean employeeInfoBean = null;

		try {
			transaction = manager.getTransaction();
			transaction.begin();

			employeeInfoBean = manager.find(EmployeeInfoBean.class, id);
			manager.remove(employeeInfoBean);
			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return true;
	}

	
	@Override
	public void registerEmployee(EmployeeInfoBean bean) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = null;
		
		try {
			 transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteEmployeee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = null;
		
		try {
			 transaction = manager.getTransaction();
			transaction.begin();
			EmployeeInfoBean bean = manager.find(EmployeeInfoBean.class, id);
			manager.remove(bean);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean updateEmployee(int id, String name, int age, double salary, String designation) {
		
		EmployeeInfoBean emb = new EmployeeInfoBean();
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("employee");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			emb = em.find(EmployeeInfoBean.class, id);
			emb.setEmpId(id);
			emb.setEmpName(name);
			emb.setAge(age);
			emb.setSalary(salary);
			emb.setDesignation(designation);

			
			if(em!=null) {
				tr.begin();
				em.persist(emb);
				tr.commit();
				return true;
			} 
			
		}catch(Exception e){
				e.printStackTrace();
			}finally {
				em.close();
			}
			
			return false;
				
			
		}
	
	}


