package fr.adaming.tool;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Connector {
	public static EntityManagerFactory emf;
	public static EntityManager em;
	public static EntityTransaction tx;

	static {
		try {

			emf = Persistence.createEntityManagerFactory("PU_Projet_Star_Wars");
			em = emf.createEntityManager();
			tx = em.getTransaction();

		} catch (Exception ex) {
			Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);

		}
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static EntityManager getEm() {
		return em;
	}

	public static EntityTransaction getTx() {
		return tx;
	}

}
