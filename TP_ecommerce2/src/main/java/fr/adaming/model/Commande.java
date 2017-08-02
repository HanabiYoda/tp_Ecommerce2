package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="commandes")
public class Commande implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_co")
	private int IdCommande;
	
	@Column(name="date_co")
	private Date dateCommande;
	
	
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName="id_client")
	private Client client;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "table de jointure", 
	joinColumns = @JoinColumn(name = "co_id", referencedColumnName = "id_co"), 
	inverseJoinColumns = @JoinColumn(name = "p_id", referencedColumnName = "id_p"))
	private List<Produit> listProduit;
	
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Commande(Date dateCommande, Client client) {
		super();
		this.dateCommande = dateCommande;
		this.client = client;
	}





	public Commande(int idCommande, Date dateCommande, Client client) {
		super();
		IdCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
	}





	public int getIdCommande() {
		return IdCommande;
	}


	public void setIdCommande(int idCommande) {
		IdCommande = idCommande;
	}


	public Date getDateCommande() {
		return dateCommande;
	}


	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
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
