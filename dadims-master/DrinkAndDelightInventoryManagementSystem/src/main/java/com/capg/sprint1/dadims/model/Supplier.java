package com.capg.sprint1.dadims.model;

public class Supplier {

	long supplierId;
	String supplierName;
	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Supplier(long supplierId, String supplierName) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + "]";
	}
	
}
