package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.ICategorieDao;
import fr.adaming.model.Categorie;

@Service("categorieServiceBean") // l'annotation pour la definition d'un bean de
									// Service specifique à spring IoC

@Transactional // l'annotation pour specifier que la methode est
				// transactionnelle . On peut la mettre sur la classe pour dire
				// que toutes les methodes de la classe sont transactionnelles

public class CategorieServiceimpl implements ICategorieService {

	// transformation de l'association UML en java
	@Autowired // l'annotation pour l'ijection de depandance
	private ICategorieDao catDao;

	@Override
	public List<Categorie> getAllCategorie() {
		return catDao.getAllCategorie();
	}

}
