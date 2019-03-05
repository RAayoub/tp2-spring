package ma.ensa.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="commande")
public class Commande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="dateCommande")
	Date dateCommande;
	
	
	@OneToMany(mappedBy="pk.commande")
	private Set<LigneCommande> ligneCommandes ; 
	
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client; 
	
	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	
	
	
}
