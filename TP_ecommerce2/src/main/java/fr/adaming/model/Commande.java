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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="commandes")
public class Commande implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_co")
	private int IdCommande;
	
	@Column(name="date_co")
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name="cl_id", referencedColumnName="id_cl")
	private Client client;

	@OneToMany(mappedBy="commande",cascade=CascadeType.ALL)
	private List<LigneCommande> listLigneCommande;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(int idCommande, Date dateCommande, Client client, List<LigneCommande> listLigneCommande) {
		super();
		IdCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
		this.listLigneCommande = listLigneCommande;
	}

	public Commande(Date dateCommande, Client client, List<LigneCommande> listLigneCommande) {
		super();
		this.dateCommande = dateCommande;
		this.client = client;
		this.listLigneCommande = listLigneCommande;
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

	public List<LigneCommande> getListLigneCommande() {
		return listLigneCommande;
	}

	public void setListLigneCommande(List<LigneCommande> listLigneCommande) {
		this.listLigneCommande = listLigneCommande;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
