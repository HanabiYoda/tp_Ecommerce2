package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.adaming.tool.Connector;

import fr.adaming.model.Categorie;

public class CategorieDaoImpl implements ICategorieDao {
	
	public EntityManager em;
	public EntityTransaction tx;

	@Override
	public List<Categorie> getAllCategorie() {
		em = Connector.getEm();
		Query getallrep = em.createQuery("Select u from Categorie as u");
		List<Categorie> lCategories = getallrep.getResultList();
		return lCategories;
	}

}
