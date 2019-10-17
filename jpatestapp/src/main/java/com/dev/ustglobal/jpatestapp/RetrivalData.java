package com.dev.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.ustglobal.jpatestapp.dto.Movie;

public class RetrivalData {
	

	public static void main(String[] args) {
		EntityManager entityManager = null;
	
	try {
		//while retrieving data we dont't need to use transaction
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
  Movie movie =  entityManager.find(Movie.class, 1);   
			/*
			 * System.out.println(movie.getClass());
			 * System.out.println(entityManager.contains(movie));
			 * entityManager.detach(movie);
			 * System.out.println(entityManager.contains(movie)); movie.setId(2);
			 * movie.setName("Hum "); movie.setRating("Good"); System.out.println(movie);
			 * System.out.println(entityManager.contains(movie));
			 */
  
			
			  System.out.println("Movie Id --"+movie.getId());
			  System.out.println("Movie Name --"+movie.getName());
			  System.out.println("Movie Rating --"+movie.getRating());
			 
	} catch (Exception e) {
		
		e.printStackTrace();
	}finally {
		entityManager.close();
	}
  
   
	
	

	}

}
