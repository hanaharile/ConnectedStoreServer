package org.ha.store.ConnectedStoreServer.util;

public enum localEnum {

	MAGASIN_1("MAGASIN_1"),
	MAGASIN_2("MAGASIN_2"),
	MAGASIN_3("MAGASIN_3"),
	MAGASIN_4("MAGASIN_4");
	
	private String name;
	
	localEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}