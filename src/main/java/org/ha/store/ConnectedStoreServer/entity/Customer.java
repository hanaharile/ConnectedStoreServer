package org.ha.store.ConnectedStoreServer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCustomer;

    private String first_name;
    
    private String last_name;
    
    private String email;
    
    private String address;
    
    private String contact;
    
    @OneToMany(mappedBy="customer") 
    private List<CustomerOrder> customerOrder;
    
    private boolean active;
    
      
    
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<CustomerOrder> getCustomerOrder() {
		return customerOrder;
	}


	public void setCustomerOrder(List<CustomerOrder> customerOrder) {
		this.customerOrder = customerOrder;
	}


	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long id) {
		this.idCustomer = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
    
    
    
}
