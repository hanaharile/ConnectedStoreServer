package org.ha.store.ConnectedStoreServer.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class StockMvt{

	public static final int ENTRY=1;
	public static final int Exit= 2;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idStockMvt;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date mvtDate;
	
	private BigDecimal quantite; 
	
	private int typeMvt ;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Produit produit;

	public Long getIdStockMvt() {
		return idStockMvt;
	}

	public void setIdStockMvt(Long idStockMvt) {
		this.idStockMvt = idStockMvt;
	}

	public Date getMvtDate() {
		return mvtDate;
	}

	public void setMvtDate(Date mvtDate) {
		this.mvtDate = mvtDate;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
   
    
    
}
