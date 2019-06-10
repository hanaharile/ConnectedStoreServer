package org.ha.store.ConnectedStoreServer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.ha.store.ConnectedStoreServer.util.localEnum;
@Entity
public class Category  {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategory;
	private String localName;	
	@OneToMany(mappedBy="category")
	private List<Produit> produits;
	

	public Category() {
		super();
		
	}
	
	
	public Category(localEnum local, List<Produit> produits) {
		super();
		this.localName = local.getName();
		this.produits = produits;
	}


	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long id) {
		this.idCategory = id;
	}
	
	
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
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
		result = prime * result + ((idCategory == null) ? 0 : idCategory.hashCode());
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
		Category other = (Category) obj;
		if (idCategory == null) {
			if (other.idCategory != null)
				return false;
		} else if (!idCategory.equals(other.idCategory))
			return false;
		return true;
	}
	
}
