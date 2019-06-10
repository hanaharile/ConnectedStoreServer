package org.ha.store.ConnectedStoreServer.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sale{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idSale;	
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date SaleDate;
	
	
	@OneToMany(mappedBy="sale")
	private List<SaleLine> saleLine;


	public Long getIdSale() {
		return idSale;
	}


	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Date getSaleDate() {
		return SaleDate;
	}


	public void setSaleDate(Date saleDate) {
		SaleDate = saleDate;
	}


	public List<SaleLine> getSaleLine() {
		return saleLine;
	}


	public void setSaleLine(List<SaleLine> saleLine) {
		this.saleLine = saleLine;
	}
	
	
}
