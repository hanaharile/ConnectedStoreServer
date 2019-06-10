package org.ha.store.ConnectedStoreServer.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SupplierOrder  {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idSupplierOrder;
	
     private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idSupplier")
	private Supplier supplier ;
	
	@OneToMany(mappedBy="supplierOrder")
	private List<OrderLineSupplier> orderLineSupplier;

	public Long getIdSupplierOrder() {
		return idSupplierOrder;
	}

	public void setIdSupplierOrder(Long idSupplierOrder) {
		this.idSupplierOrder = idSupplierOrder;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public List<OrderLineSupplier> getOrderLineSupplier() {
		return orderLineSupplier;
	}

	public void setOrderLineSupplier(List<OrderLineSupplier> orderLineSupplier) {
		this.orderLineSupplier = orderLineSupplier;
	}

	
	
}
