package ma.ensa.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable 	
public class LineCommandId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="produit_id")
	private Produit produit;
	
	
	@ManyToOne
	@JoinColumn(name="commande_id")
	private Commande commande;


	public LineCommandId() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LineCommandId(Produit produit, Commande commande) {
		super();
		this.produit = produit;
		this.commande = commande;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
