package ma.ensa.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.entities.LigneCommande;
import ma.ensa.entities.Produit;

@Service
public class Pannier implements IPannier{

	
	private LigneCommande ligneCommande = new LigneCommande(); 
	
	private Map<Integer,LigneCommande> items = new HashMap<>() ;

	
	public void addItem(Produit produit,int qte) {
		
		LigneCommande lc = items.get(produit.getId());
		
		 if(lc!=null) {
			lc.setQuantite(lc.getQuantite()+qte);
		}
		else {
			
			System.out.println(ligneCommande.getPk().toString());
			ligneCommande.getPk().setProduit(produit);
			ligneCommande.setQuantite(qte);
			items.put(produit.getId(), ligneCommande);
		}
	}
	



	@Override
	public void removeItem(int idProduit) {
		
		if(items.get(idProduit) != null) {
			items.remove(idProduit) ; 
		}
		
	}
	
	


	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}


	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}




	
	
	
	
}
