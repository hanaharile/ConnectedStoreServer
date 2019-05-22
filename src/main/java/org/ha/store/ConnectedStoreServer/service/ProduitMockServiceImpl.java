package org.ha.store.ConnectedStoreServer.service;

import java.util.ArrayList;
import java.util.List;

import org.ha.store.ConnectedStoreServer.entity.Produit;
import org.springframework.stereotype.Service;

@Service
public class ProduitMockServiceImpl implements IProduitService {

	
	private List<Produit> produits;

public	ProduitMockServiceImpl()
	{ 
	produits= new ArrayList<Produit>();
//	produits.add(new Produit("PC DELL",10000,13));
//	produits.add(new Produit("PC HP",5000,10));
//	produits.add(new Produit("Samsung A10",10500,13));
//	produits.add(new Produit("OPPO 11",10500,13));

	}	
		
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit p) {

		produits.add(p);
	}

	@Override
	public void updateProduit(Produit p) {
	
		produits.remove(p);
		produits.add(p);	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit=new Produit();
		produit.setId(id);
		produits.remove(produit)	;
	}

}
