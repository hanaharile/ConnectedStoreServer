package org.ha.store.ConnectedStoreServer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type  {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idType;
	private String typename;
	
	@OneToMany(mappedBy="type")
	private List<Produit> produits;
	
	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdType() {
		return idType;
	}
	public void setIdType(Long id) {
		this.idType = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idType == null) ? 0 : idType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Type other = (Type) obj;
		if (idType == null) {
			if (other.idType != null)
				return false;
		} else if (!idType.equals(other.idType))
			return false;
		return true;
	}
	
	
}

