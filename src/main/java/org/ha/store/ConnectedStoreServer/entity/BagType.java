package org.ha.store.ConnectedStoreServer.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.ha.store.ConnectedStoreServer.util.BagTypeEnum;

@Entity
public class BagType{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idBagType;
	
	private String name;

	public BagType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BagType( BagTypeEnum name) {
		super();
		this.name = name.getName();
	}

	public Long getIdBagType() {
		return idBagType;
	}

	public void setIdBagType(Long id) {
		this.idBagType = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idBagType == null) ? 0 : idBagType.hashCode());
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
		BagType other = (BagType) obj;
		if (idBagType == null) {
			if (other.idBagType != null)
				return false;
		} else if (!idBagType.equals(other.idBagType))
			return false;
		return true;
	}
	
	
}
