package fr.adaming.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.adaming.model.Categorie;
import fr.adaming.service.ICategorieService;

@ManagedBean(name = "catMB")
@RequestScoped // le conteur web va instancier un nouveau chaque fois que je
				// quite la page

public class ClientManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// les attributs utilisé par la vue
	private Categorie categorie;

	private List<Categorie> liste;

	@ManagedProperty(value = "#{categorieServiceBean}")
	private ICategorieService catService;

	// Le Setter pour l'injection de dependances. il est obligatoire car
	// l'annottaion @ManagedProperty exige un setter
	public void setCatService(ICategorieService catService) {
		this.catService = catService;
	}

	// constructeur vide
	public ClientManagedBean() {
		super();
		// instancier l'employe pour eviter l'exception target Unreachable
		this.categorie = new Categorie();
	}

	// les getters et setters pour les attributs utilisés par la vue
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Categorie> getListe() {
		return liste;
	}

	public void setListe(List<Categorie> liste) {
		this.liste = liste;
	}

	
}
