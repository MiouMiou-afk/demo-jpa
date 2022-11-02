package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("region");
		EntityManager em = entityManagerFactory.createEntityManager();
	 
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Region region = new Region();
		region.setNom("Centre");
		em.persist(region);
		transaction.commit();
	}

	





}
