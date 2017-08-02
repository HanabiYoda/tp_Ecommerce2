package fr.adaming.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Categorie;

@Repository
public class CategorieDaoImpl implements ICategorieDao {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Categorie> getAllCategorie() {
		// TODO Auto-generated method stub
		return null;
	}

}
