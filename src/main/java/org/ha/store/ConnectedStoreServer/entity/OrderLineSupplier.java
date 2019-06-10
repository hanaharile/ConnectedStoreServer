package org.ha.store.ConnectedStoreServer.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderLineSupplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idOrderLineSupplier;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private Produit produit;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idSupplierOrder")
	private SupplierOrder supplierOrder;

}
