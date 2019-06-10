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
public class CustomerOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCustomerOrder;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idCustomer")
	private Customer customer ;
	
	@OneToMany(mappedBy="idOrderLineCustomer")
	private List<OrderLineCustomer> orderLineClient;

	public Long getIdCustomerOrder() {
		return idCustomerOrder;
	}

	public void setIdCustomerOrder(Long idOrderCustomer) {
		this.idCustomerOrder = idOrderCustomer;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderLineCustomer> getOrderLineClient() {
		return orderLineClient;
	}

	public void setOrderLineClient(List<OrderLineCustomer> orderLineClient) {
		this.orderLineClient = orderLineClient;
	}
	
	
	
}
