package org.ha.store.ConnectedStoreServer.service.Impl;

import java.util.List;

import org.ha.store.ConnectedStoreServer.entity.Produit;
import org.ha.store.ConnectedStoreServer.repository.ProduitRepository;
import org.ha.store.ConnectedStoreServer.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProduitService implements ICrudService<Produit, Long> {

	@Autowired
	private ProduitRepository produitRep;
	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return produitRep.findAll();
	}

	@Override
	public void add(Produit p) {
		// TODO Auto-generated method stub
		produitRep.save(p);
	}

	@Override
	public void update(Produit p) {
		// TODO Auto-generated method stub
		produitRep.save(p);
	}

	@Override
	public void delete(Long id) {
		produitRep.deleteById(id);

//		Produit produit = new Produit();
//		produit.setId(id);
//		produitRep.delete(produit);
	}

}
