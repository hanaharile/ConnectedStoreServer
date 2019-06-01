package org.ha.store.ConnectedStoreServer.controller;


import java.util.List;

import org.ha.store.ConnectedStoreServer.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



public class CrudController<T, ID> {
	
	@Autowired
	private ICrudService<T, ID> service;
	
	@GetMapping
	public List<T> getAll(){
		return service.getAll();
	}
	@PostMapping
	public void add(@RequestBody T p){
		service.add(p);
	}
	
	@PutMapping
	public void update(@RequestBody T p){
		service.update(p);
	}
	
	@DeleteMapping(path="/{id}")
	public void delete(@PathVariable ID id){
		service.delete(id);
	}
}
