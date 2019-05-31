package org.ha.store.ConnectedStoreServer.controller;
import org.ha.store.ConnectedStoreServer.entity.Produit;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produits")
@CrossOrigin
public class ProduitController extends CrudController<Produit, Long> {
	
	
}
