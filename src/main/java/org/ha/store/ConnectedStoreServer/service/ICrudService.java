package org.ha.store.ConnectedStoreServer.service;

import java.util.List;

public interface ICrudService<T,ID> {

	List<T> getAll();
	
	void add(T p);
	
	void update(T p);
	
	void delete(ID id);
}
