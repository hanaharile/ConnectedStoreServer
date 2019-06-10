package org.ha.store.ConnectedStoreServer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idSupplier;

    private String first_name;
    private String last_name;
    private String address;
    private String email;
    private String contact;
	@OneToMany(mappedBy="supplier")
    private List<SupplierOrder> supplierOrder;
    private boolean active;
     
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(Long id) {
		this.idSupplier = id;
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
