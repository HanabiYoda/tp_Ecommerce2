package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="clients")
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_c")
	private int idClient;
	@Column(name="nom_c")
	private String nomClient;
	@Column(name="adresse_c")
	private String adresse;
	@Column(name="email_c")
	private String email;
	@Column(name="tel_c")
	private String tel;
	

}
