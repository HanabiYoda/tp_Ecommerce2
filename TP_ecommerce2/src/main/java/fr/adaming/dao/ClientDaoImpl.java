package fr.adaming.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;
import fr.adaming.tool.Connector;

@Repository // l'annotation pour la definition d'un de Dao de Spring IoC
public class ClientDaoImpl implements IClientDao {

	@Autowired // pour l'injection du bean sessionFactory. elle est specifique à spring
	
	public EntityManager em;
	public EntityTransaction tx;
	
	@Override
	public void addClient(Client cl) {
		em = Connector.getEm();
		tx = Connector.getTx();
		try {
			tx.begin();
			em.persist(cl);
			tx.commit();
		} catch (Exception e) {
			Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public void updateClient(Client cl) {
		
	}

	@Override
	public void deleteClient(int id_cl) {
	
	}

}
