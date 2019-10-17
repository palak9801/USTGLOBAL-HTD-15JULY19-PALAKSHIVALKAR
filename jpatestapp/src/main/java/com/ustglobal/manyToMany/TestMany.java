
package com.ustglobal.manyToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMany {

	public static void main(String[] args) {
		Courses courses = new Courses();
		courses.setC_id(11112);
		courses.setC_name("Angular");
		
		
		Courses courses1 = new Courses();
		courses1.setC_id(22225);
		courses1.setC_name("Java");
		
		Courses courses2 = new Courses();
		courses2.setC_id(33335);
		courses2.setC_name("SQL");
		
		
		ArrayList<Courses> arraylist = new ArrayList<Courses>();
		arraylist.add(courses);
		arraylist.add(courses1);
		arraylist.add(courses2);
		
		Student student = new Student();
		student.setS_id(11283);
		student.setS_name("palak");
		student.setCourses(arraylist);
		
		Student student1 = new Student();
		student1.setS_id(22273);
		student1.setS_name("pushkar");
		student1.setCourses(arraylist);
		
		
		Student student2 = new Student();
		student2.setS_id(33235);
		student2.setS_name("jenny");
		student2.setCourses(arraylist);
		
		
		
		
		
		
		EntityTransaction transaction= null;
		EntityManager entityManager= null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(student);
			entityManager.persist(student1);
			entityManager.persist(student2);
			
			System.out.println("Saved");

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}
		
		
		

	}

}
