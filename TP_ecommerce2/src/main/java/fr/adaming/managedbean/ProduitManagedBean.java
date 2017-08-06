package fr.adaming.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.adaming.model.Categorie;
import fr.adaming.model.Produit;
import fr.adaming.service.ICategorieService;
import fr.adaming.service.IProduitService;

@ManagedBean(name = "proMB")
@RequestScoped // le conteur web va instancier un nouveau chaque fois que je
				// quite
				// la page
public class ProduitManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// les attributs utilisé par la vue
	private Produit produit;

	private List<Produit> liste;

	@ManagedProperty(value = "#{produitServiceBean}")
	private IProduitService proService;

	// Le Setter pour l'injection de dependances. il est obligatoire car
	// l'annottaion @ManagedProperty exige un setter
	public void setProService(IProduitService proService) {
		this.proService = proService;
	}

	public IProduitService getProService() {
		return proService;
	}

	// constructeur vide
	public ProduitManagedBean() {
		super();
		// instancier l'employe pour eviter l'exception target Unreachable
		this.produit = new Produit();
	}

	@PostConstruct // cette annotation veut dire que la methode sera executé
	// apres l'instaciation du managedBean
	public void init() {
		this.liste = proService.getAllProduit();
	}

	// les getters et setters pour les attributs utilisés par la vue
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public List<Produit> getListe() {
		return liste;
	}

	public void setListe(List<Produit> liste) {
		this.liste = liste;
	}

	// les methodes Metiers
	public String ajouterProduit() {
		// appel de la methode service
		proService.addProduit(this.produit);
		this.liste = proService.getAllProduit();
		System.out.println("-------   " + liste.size());
		return "index";
	}

	public String modifierProduit() {
		proService.updateProduit(this.produit);
		this.liste = proService.getAllProduit();
		return "index";
	}

	public String supprimerProduit() {
		proService.deleteProduit(this.produit.getIdPr());
		this.liste = proService.getAllProduit();
		return "index";
	}

	public String rechercherProduit() {
		this.produit = proService.getProduitNom(this.produit.getDescriptionPr());
		return "rechercherProduit";
	}

}
