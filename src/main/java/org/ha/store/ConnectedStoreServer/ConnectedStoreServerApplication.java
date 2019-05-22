package org.ha.store.ConnectedStoreServer;

import org.ha.store.ConnectedStoreServer.entity.Produit;
import org.ha.store.ConnectedStoreServer.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectedStoreServerApplication implements CommandLineRunner{
@Autowired
ProduitRepository produitRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ConnectedStoreServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		produitRepository.save(new Produit("Pc HP",10000,2));
//		produitRepository.save(new Produit("Imprimante66",200,29));
//		produitRepository.save(new Produit("Pc Dell",6000,10));
//		produitRepository.save(new Produit("souris ",100,112));
		produitRepository.findAll().forEach(p->{System.out.println(p.getRef());});

	}

}
