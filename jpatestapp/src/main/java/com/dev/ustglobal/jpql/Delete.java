package com.dev.ustglobal.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			String jpql3 = "delete from Movie where id=:nm";
			 Query query3 = entityManager.createQuery(jpql3);
			 query3.setParameter("nm", 3);
			 int j = query3.executeUpdate();
			 System.out.println(j);
			 
			 
//--------------------------update-----------------------------------
			 
			 String jpql2 = "update Movie set name=:nmm where id=:idd";
			  Query query2 = entityManager.createQuery(jpql2);
			  System.out.println("enter the name to be set --");
			  String nme = sc.nextLine();
			  query2.setParameter("nmm", nme);
			  query2.setParameter("idd", 2);
			  
			 int i =  query2.executeUpdate();
			 System.out.println(i);
			 

			 
		
			 
			
			
			 transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
