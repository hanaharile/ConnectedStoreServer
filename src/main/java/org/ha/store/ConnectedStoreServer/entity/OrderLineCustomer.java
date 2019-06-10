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
public class OrderLineCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idOrderLineCustomer;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private Produit produit;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idCustomerOrder")
	private CustomerOrder customerOrder;

	public Long getIdOrderLineCustomer() {
		return idOrderLineCustomer;
	}

	public void setIdOrderLineCustomer(Long idOrderLineCustomer) {
		this.idOrderLineCustomer = idOrderLineCustomer;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setOrderCustomer(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
	
	

}
