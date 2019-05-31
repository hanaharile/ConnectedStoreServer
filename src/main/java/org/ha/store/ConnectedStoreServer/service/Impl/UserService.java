package org.ha.store.ConnectedStoreServer.service.Impl;

import java.util.List;

import org.ha.store.ConnectedStoreServer.entity.User;
import org.ha.store.ConnectedStoreServer.repository.UserRepository;
import org.ha.store.ConnectedStoreServer.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserService implements ICrudService<User, Long> {

	@Autowired
	private UserRepository UserRep;
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return UserRep.findAll();
	}

	@Override
	public void add(User p) {
		// TODO Auto-generated method stub
		UserRep.save(p);
	}

	@Override
	public void update(User p) {
		// TODO Auto-generated method stub
		UserRep.save(p);
	}

	@Override
	public void delete(Long id) {
		UserRep.deleteById(id);

//		User user = new User();
//		user.setId(id);
//		UserRep.delete(user);
	}

}
