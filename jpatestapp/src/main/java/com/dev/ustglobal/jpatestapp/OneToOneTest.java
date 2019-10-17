package com.dev.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.ustglobal.oneToone.Person;
import com.dev.ustglobal.oneToone.VoterCard;


public class OneToOneTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(2);
		person.setName("palak");
		VoterCard vc = new VoterCard();
		vc.setVid(123);
		vc.setVname("palak");
	person.setVotercard(vc);

		EntityTransaction transaction= null;
		EntityManager entityManager= null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(person);    //unidirectional
			
			//bidirectional
			VoterCard voterCard = entityManager.find(VoterCard.class,122);
			String a = voterCard.getPerson().getName();
			int b = voterCard.getPerson().getId();
			
			System.out.println(a);
			System.out.println(b);
		
			
			
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
