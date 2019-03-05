package ma.ensa.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="avoir")
public class Avoir {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Date dateAvoir ;
	private int quantite ;
	
	@OneToMany(mappedBy="avoir")
	private Set<LigneCommande> ligneCommandes ; 
	
	
	public Avoir() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avoir(Date dateAvoir, int quantite) {
		super();
		this.dateAvoir = dateAvoir;
		this.quantite = quantite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateAvoir() {
		return dateAvoir;
	}
	public void setDateAvoir(Date dateAvoir) {
		this.dateAvoir = dateAvoir;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	} 
	
	
	
	
}
