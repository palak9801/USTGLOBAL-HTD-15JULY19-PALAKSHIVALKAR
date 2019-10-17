package com.dev.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.ustglobal.jpatestapp.dto.Movie;

public class RetrivalWithGetReferenceMethod {

	public static void main(String[] args) {
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			//Movie movie = entityManager.find(Movie.class, 1);
			Movie movie =  entityManager.getReference(Movie.class,1); // 
			


			
			
			  System.out.println("Movie Id --"+movie.getId());
			  System.out.println("Movie Name --"+movie.getName());
			  System.out.println("Movie Rating --"+movie.getRating());
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
