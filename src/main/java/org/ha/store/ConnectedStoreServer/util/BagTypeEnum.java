package org.ha.store.ConnectedStoreServer.util;

public enum BagTypeEnum {

	BAG_25("BAG_25_KG"),
	BAG_50("BAG_50_KG");
	
	private String name;
	
	BagTypeEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}