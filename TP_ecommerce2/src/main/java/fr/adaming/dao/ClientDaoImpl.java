package fr.adaming.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;

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
			em.persist(t);
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
