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


import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="produits")
public class Produit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_p")
	private int id_Produit;
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
	@JoinColumn(name="co_id", referencedColumnName="id_co")
	private Categorie categorie;
	
	@OneToMany(mappedBy="Produit",cascade=CascadeType.ALL)
	private List<Produit> listProduit;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(int id_Produit, String designation, String description, double prix, int quantite,
			boolean selectionne, String photo, Categorie categorie, List<Produit> listProduit) {
		super();
		this.id_Produit = id_Produit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
		this.categorie = categorie;
		this.listProduit = listProduit;
	}

	public Produit(String designation, String description, double prix, int quantite, boolean selectionne, String photo,
			Categorie categorie, List<Produit> listProduit) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
		this.categorie = categorie;
		this.listProduit = listProduit;
	}

	public int getId_Produit() {
		return id_Produit;
	}

	public void setId_Produit(int id_Produit) {
		this.id_Produit = id_Produit;
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

	public List<Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


	




}
