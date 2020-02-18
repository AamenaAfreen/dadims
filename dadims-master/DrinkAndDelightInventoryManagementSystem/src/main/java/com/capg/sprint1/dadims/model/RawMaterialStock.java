package com.capg.sprint1.dadims.model;

import java.util.Date;

public class RawMaterialStock {

	String orderId;
	String name;
	double price_per_unit;
	double quantityValue;
	int quantityUnit;
	double price;
	String warehouseId;
	Date deliveryDate;
	Date manufacturingDate;
	Date expiryDate;
	String qualityCheck;
	Date processDate;
	
	public RawMaterialStock() {
		super();
	}

	public RawMaterialStock(String orderId, String name, double price_per_unit, double quantityValue,
			int quantityUnit, double price, String warehouseId, Date deliveryDate, Date manufacturingDate,
			Date expiryDate, String qualityCheck, Date processDate) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price_per_unit = price_per_unit;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseId = warehouseId;
		this.deliveryDate = deliveryDate;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.processDate = processDate;
	}

	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public int getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getQualityCheck() {
		return qualityCheck;
	}

	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	@Override
	public String toString() {
		return "RawMaterialStock [orderId=" + orderId + ", name=" + name + ", price_per_unit=" + price_per_unit
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price
				+ ", warehouseId=" + warehouseId + ", deliveryDate=" + deliveryDate + ", manufacturingDate="
				+ manufacturingDate + ", expiryDate=" + expiryDate + ", qualityCheck=" + qualityCheck + ", processDate="
				+ processDate + "]";
	}
	
	
}
