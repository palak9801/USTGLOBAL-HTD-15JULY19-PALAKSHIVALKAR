package com.dev.ustglobal.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dev.ustglobal.jpatestapp.dto.Movie;

public class Read {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			String jpql = "from Movie";
			Query query= entityManager.createQuery(jpql);
			List<Movie> resultList = query.getResultList();
			
			for( Movie movie : resultList) {
				System.out.println(movie.getId());
				System.out.println(movie.getName());
				System.out.println(movie.getRating());
				System.out.println("****************");
		
			}
//---------------------------------to display name only-----------------------------------------------------------------------------------------------------------------
			String jpql1 = "select name from Movie";
			Query query1 = entityManager.createQuery(jpql1);
			
			  List<String> resultList1 = query1.getResultList();
			  
			  for( String string : resultList1) { System.out.println(string);
			  System.out.println("**************"); }
			 
//----------------------------------------update-----------------------------------------------------------------------------------
			 transaction.begin();
			  String jpql2 = "update Movie set name='DDLJ' where id=3";
			  Query query2 = entityManager.createQuery(jpql2);
			  
			 int i =  query2.executeUpdate();
			 System.out.println(i);
			 
			 
//-----------------------------------delete-----------------------------------------
			 String jpql3 = "delete from Movie where id=4";
			 Query query3 = entityManager.createQuery(jpql3);
			 
			 int j = query3.executeUpdate();
			 System.out.println(j);
			 
			 
	
			  
			  
			  
			 transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
