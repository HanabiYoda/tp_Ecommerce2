package fr.adaming.service;

import fr.adaming.model.Client;

public interface IClientService {
	
	public void addClient(Client cl); 
	
	public void updateClient(Client cl);
	
	public void deleteClient(int id_cl);

}
