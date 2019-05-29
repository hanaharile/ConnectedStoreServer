package org.ha.store.ConnectedStoreServer.repository;

import org.ha.store.ConnectedStoreServer.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long>{

}
