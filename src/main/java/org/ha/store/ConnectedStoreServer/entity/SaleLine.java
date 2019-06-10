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
public class SaleLine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idSaleLine;	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private Produit produit;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idSale")
	private Sale sale;
	
	

	public Long getIdSaleLine() {
		return idSaleLine;
	}

	public void setIdSaleLine(Long idSaleLine) {
		this.idSaleLine = idSaleLine;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	

	
}
