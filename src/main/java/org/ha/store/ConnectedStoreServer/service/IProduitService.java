package org.ha.store.ConnectedStoreServer.service;

import java.util.List;

import org.ha.store.ConnectedStoreServer.entity.*;
public interface IProduitService {

	List<Produit> getProduits();
	void addProduit(Produit p);
	void updateProduit(Produit p);
	void deleteProduit(String ref);
}
