package ma.ensa.service;

import ma.ensa.entities.LigneCommande;
import ma.ensa.entities.Produit;

public interface IPannier {
	
	void addItem(Produit produit,int qte);
	void removeItem(int idProduit) ;


}
