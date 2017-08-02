package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Produit;

public interface IProduitService {
	
	public void addProduit(Produit pr); 
	
	public List<Produit>  getAllProduit();
	
	public Produit getEmployeById(int id_pr);
	
	public void updateProduit(Produit pr);
	
	public void deleteProduit(int id_pr);

}
