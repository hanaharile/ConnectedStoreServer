package org.ha.store.ConnectedStoreServer.service;

import java.util.List;

import org.ha.store.ConnectedStoreServer.entity.Produit;
import org.ha.store.ConnectedStoreServer.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProduitService implements IProduitService {

	@Autowired
	private ProduitRepository produitRep;
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produitRep.findAll();
	}

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		produitRep.save(p);
	}

	@Override
	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		produitRep.save(p);
	}

	@Override
	public void deleteProduit(Long id) {
		produitRep.deleteById(id);

//		Produit produit = new Produit();
//		produit.setId(id);
//		produitRep.delete(produit);
	}

}
