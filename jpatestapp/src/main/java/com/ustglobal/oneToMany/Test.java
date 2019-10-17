package com.ustglobal.oneToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Pencils pencils = new Pencils();
		pencils.setPid(1);
		pencils.setPname("apsara");
		
		Pencils pencils1 = new Pencils();
		pencils1.setPid(2);
		pencils.setPname("Doms");
		
		ArrayList<Pencils> lst = new ArrayList<Pencils>();
		lst.add(pencils);
		lst.add(pencils1);
		
		PencilBox pencilbox = new PencilBox();
		pencilbox.setBoxid(11);
		pencilbox.setBname("Navneet");
		pencilbox.setPencils(lst);
		
		
		EntityTransaction transaction= null;
		EntityManager entityManager= null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(pencilbox);
			
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
