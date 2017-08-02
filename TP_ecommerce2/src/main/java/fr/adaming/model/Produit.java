package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="produits")
public class Produit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_p")
	private int idProduit;
	@Column(name="designation_p")
	private String designation;
	@Column(name="descrip_p")
	private String description;
	@Column(name="prix_p")
	private double prix;
	@Column(name="quant_p")
	private int quantite;
	@Column(name="selection_p")
	private boolean selectionne;
	@Column(name="photo_p")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="c_id", referencedColumnName="id_c")
	private Categorie categorie;
	
	@ManyToMany(mappedBy="listProduit",fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Commande> listCommande;
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Produit(int idProduit, String designation, String description, double prix, int quantite,
			boolean selectionne, String photo, Categorie categorie) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
		this.categorie = categorie;
	}



	public Produit(String designation, String description, double prix, int quantite, boolean selectionne, String photo,
			Categorie categorie) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
		this.categorie = categorie;
	}




	public int getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public boolean isSelectionne() {
		return selectionne;
	}


	public void setSelectionne(boolean selectionne) {
		this.selectionne = selectionne;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public List<Commande> getListCommande() {
		return listCommande;
	}


	public void setListCommande(List<Commande> listCommande) {
		this.listCommande = listCommande;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
