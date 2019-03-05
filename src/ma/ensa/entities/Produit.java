package ma.ensa.entities;

import java.util.Set;

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
@Table(name="produit")
public class Produit {
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="prix")
	double prix;
	@Column(name="description")
	String description;
	
	@ManyToOne
	@JoinColumn(name="categorie_id")
	private Categorie categorie ; 
	
	@OneToMany(mappedBy="pk.produit")
	private Set<LigneCommande> ligneCommandes ; 
	
	
	public Produit(double prix, String description) {
		super();
		this.prix = prix;
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
}
