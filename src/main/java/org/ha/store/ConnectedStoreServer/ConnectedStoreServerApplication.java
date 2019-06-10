package org.ha.store.ConnectedStoreServer;

import java.util.Arrays;

import org.ha.store.ConnectedStoreServer.entity.Produit;
import org.ha.store.ConnectedStoreServer.entity.Role;
import org.ha.store.ConnectedStoreServer.entity.User;
import org.ha.store.ConnectedStoreServer.repository.ProduitRepository;
import org.ha.store.ConnectedStoreServer.repository.RoleRepository;
import org.ha.store.ConnectedStoreServer.repository.UserRepository;
import org.ha.store.ConnectedStoreServer.util.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectedStoreServerApplication implements CommandLineRunner{
//@Autowired
//ProduitRepository produitRepository;
@Autowired
RoleRepository roleRepository;
@Autowired
UserRepository userRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(ConnectedStoreServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		produitRepository.save(new Produit("sulfate d'aluminium",300,2));
//		produitRepository.save(new Produit("Imprimante66",200,29));
//		produitRepository.save(new Produit("Pc Dell",6000,10));
//		produitRepository.save(new Produit("souris ",100,112));
//		produitRepository.findAll().forEach(p->{System.out.println(p.getRef());});
//		
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
 		
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);

		roleRepository.findAll().forEach(p->{System.out.println(p.getName());});

		
		User user = new User("user", "password1", "Mohammed","Salah",true);
		user.setRoles(Arrays.asList(roleUser));
		
		userRepository.save(user);
		
		User admin = new User("admin", "password2","Abdel","Chlih", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		
		userRepository.save(admin);

	}

}
