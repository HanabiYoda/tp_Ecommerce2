package fr.adaming.dao;

import fr.adaming.model.Client;

public interface IClientDao {
	
	public void addClient(Client cl); 
	
	public void updateClient(Client cl);
	
	public void deleteClient(int id_cl);

}
