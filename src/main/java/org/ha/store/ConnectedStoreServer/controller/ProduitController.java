package org.ha.store.ConnectedStoreServer.controller;

import org.ha.store.ConnectedStoreServer.service.IProduitService;

import java.util.List;

import org.ha.store.ConnectedStoreServer.entity.Produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produits")
@CrossOrigin
public class ProduitController{
	
	@Autowired
	private IProduitService produitService;
	
	@GetMapping
	public List<Produit> getProduits(){
		return produitService.getProduits();
	}
	@PostMapping
	public void addProduit (@RequestBody Produit p){
		 produitService.addProduit(p);
	}
	
	@PutMapping
	public void updateProduit (@RequestBody Produit p){
		produitService.updateProduit(p);
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteProduit (@PathVariable Long id){
		 produitService.deleteProduit(id);
	}
}
