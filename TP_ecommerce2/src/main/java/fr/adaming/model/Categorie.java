package fr.adaming.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name="categories")
public class Categorie implements Serializable {

	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_c")
private int IdCategorie;
@Column(name="nom_c") 
private String nomCategorie;
@Column(name="des_c")
private String description;


@OneToMany(mappedBy="Categorie",cascade=CascadeType.ALL)
private List<Produit> listProduit;


public Categorie() {
super();
// TODO Auto-generated constructor stub
}


public Categorie(int idCategorie, String nomCategorie, String description) {
super();
IdCategorie = idCategorie;
this.nomCategorie = nomCategorie;
this.description = description;
}


public Categorie(String nomCategorie, String description) {
super();
this.nomCategorie = nomCategorie;
this.description = description;
}


public int getIdCategorie() {
return IdCategorie;
}


public void setIdCategorie(int idCategorie) {
IdCategorie = idCategorie;
}


public String getNomCategorie() {
return nomCategorie;
}


public void setNomCategorie(String nomCategorie) {
this.nomCategorie = nomCategorie;
}


public String getDescription() {
return description;
}


public void setDescription(String description) {
this.description = description;
}





}
