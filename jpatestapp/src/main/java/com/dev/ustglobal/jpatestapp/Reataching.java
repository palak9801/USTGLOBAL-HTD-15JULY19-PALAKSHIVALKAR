package com.dev.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.ustglobal.jpatestapp.dto.Movie;

public class Reataching {

	public static void main(String[] args) {
		EntityTransaction transaction= null;
		EntityManager entityManager = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie = entityManager.find(Movie.class, 5);
			System.out.println(movie.getClass());
			System.out.println(entityManager.contains(movie));
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));

			movie.setName("Hum Tum");
			movie.setRating("Good");
			Movie mrgObj = entityManager.merge(movie);
			System.out.println(entityManager.contains(mrgObj));
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}

	}

}
