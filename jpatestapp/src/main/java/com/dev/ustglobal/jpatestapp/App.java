package com.dev.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.dev.ustglobal.jpatestapp.dto.Movie;

public class App 
{  

	public static void main( String[] args )
	{
		EntityTransaction transaction= null;
		EntityManager entityManager = null;

		Movie movie = new Movie();
		movie.setId(5);
		movie.setName("M.S Dhoni");
		movie.setRating("Excellent");
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Saved");
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
		}finally {
			entityManager.close();

		}























	}
}
