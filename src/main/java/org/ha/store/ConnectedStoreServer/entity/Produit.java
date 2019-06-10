package org.ha.store.ConnectedStoreServer.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name="Product")
public class Produit {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String ref;	
	@NotNull
	private BigDecimal prixUnitaireHT;
	@NotNull
	private BigDecimal tauxTva;
	@NotNull
	private BigDecimal prixUnitaireTTC;
	@NotNull
	private int quantite;
	@Null
	private String description;
	@Null
	private String NCAS;
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idCategory")
	private Category category;
	@Null
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="idType")
	private Type type;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="bagtypes",
	joinColumns={@JoinColumn(name="id")},
	inverseJoinColumns={@JoinColumn(name="idBagType")})
	private List<BagType> bagtype;
	private String photo;
	

	public Produit() {
		super();
		
	}

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getRef() {
		return ref;
	}



	public void setRef(String ref) {
		this.ref = ref;
	}



	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}



	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}



	public BigDecimal getTauxTva() {
		return tauxTva;
	}



	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}



	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}



	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}



	public int getQuantite() {
		return quantite;
	}



	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getNCAS() {
		return NCAS;
	}



	public void setNCAS(String nCAS) {
		NCAS = nCAS;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}

	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}

	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Produit other = (Produit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}