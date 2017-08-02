package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligneCommandes")
public class LigneCommande implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_l")
	private int id_Ligne;
	@Column(name = "quant_l")
	private int quantite;
	@Column(name = "prix_l")
	private double prix;

	@ManyToOne
	@JoinColumn(name = "co_id", referencedColumnName = "id_co")
	private Commande commande;

	@ManyToOne
	@JoinColumn(name = "p_id", referencedColumnName = "id_p")
	private Produit produit;

	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneCommande(int id_Ligne, int quantite, double prix) {
		super();
		this.id_Ligne = id_Ligne;
		this.quantite = quantite;
		this.prix = prix;
	}

	public LigneCommande(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

	public int getId_Ligne() {
		return id_Ligne;
	}

	public void setId_Ligne(int id_Ligne) {
		this.id_Ligne = id_Ligne;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
