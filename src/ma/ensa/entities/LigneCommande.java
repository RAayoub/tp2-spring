package ma.ensa.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lignecommande")
public class LigneCommande {

	@Id
	private LineCommandId pk ; 
	
	@ManyToOne
	private Avoir avoir ; 
	
	private int quantite ; 
	



	

	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public LineCommandId getPk() {
		return pk;
	}


	public void setPk(LineCommandId pk) {
		this.pk = pk;
	}


	public Avoir getAvoir() {
		return avoir;
	}


	public void setAvoir(Avoir avoir) {
		this.avoir = avoir;
	}

	
	
	
	
	
}
