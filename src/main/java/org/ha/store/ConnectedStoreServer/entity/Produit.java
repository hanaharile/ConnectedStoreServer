package org.ha.store.ConnectedStoreServer.entity;


public class Produit {

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String ref;
		
	private double prixUnitaire;
	
	private int quantite;


	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String ref, double prixUnitaireint ,int quantite) {
		super();
		this.ref = ref;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;

	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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