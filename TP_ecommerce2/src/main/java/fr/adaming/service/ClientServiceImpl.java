package fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;

@Service("clientServiceBean") // l'annotation pour la definition d'un bean de
								// Service specifique à spring IoC

@Transactional // l'annotation pour specifier que la methode est
				// transactionnelle . On peut la mettre sur la classe pour dire
				// que toutes les methodes de la classe sont transactionnelles
public class ClientServiceImpl implements IClientService {

	// transformation de l'association UML en java
	@Autowired // l'annotation pour l'ijection de depandance

	private IClientDao clDao;
	
	public void setClDao(IClientDao clDao) {
		this.clDao = clDao;
	}

	@Override
	public void addClient(Client cl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClient(Client cl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteClient(int id_cl) {
		// TODO Auto-generated method stub

	}

}
