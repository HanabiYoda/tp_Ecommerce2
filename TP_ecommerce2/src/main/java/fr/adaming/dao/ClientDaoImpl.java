package fr.adaming.dao;


import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;


@Repository // l'annotation pour la definition d'un de Dao de Spring IoC
public class ClientDaoImpl implements IClientDao {

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