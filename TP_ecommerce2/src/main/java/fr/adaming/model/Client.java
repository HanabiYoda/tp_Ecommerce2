package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="clients")
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int idClient;
	@Column(name="nom_cl")
	private String nomClient;
	@Column(name="adresse_cl")
	private String adresse;
	@Column(name="email_cl")
	private String email;
	@Column(name="tel_cl")
	private String tel;
	
	
	@OneToMany(mappedBy="client",cascade=CascadeType.ALL)
	private List<Commande> listCommande;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Client(String nomClient, String adresse, String email, String tel) {
		super();
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}




	public Client(int idClient, String nomClient, String adresse, String email, String tel) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}




	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
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
