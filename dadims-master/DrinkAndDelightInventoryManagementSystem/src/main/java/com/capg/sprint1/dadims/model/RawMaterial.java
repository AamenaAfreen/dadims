package com.capg.sprint1.dadims.model;

public class RawMaterial {

	long itemId;
	String itemName;
	float price;
	Supplier supplier;
	Distributor distributor;
	public RawMaterial(long itemId, String itemName, float price, Supplier supplier, Distributor distributor) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.supplier = supplier;
		this.distributor = distributor;
	}
	
	public RawMaterial() {
		// TODO Auto-generated constructor stub
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Distributor getDistributor() {
		return distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	@Override
	public String toString() {
		return "RawMaterial [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", supplier="
				+ supplier + ", distributor=" + distributor + "]";
	}
	
	
	
}
