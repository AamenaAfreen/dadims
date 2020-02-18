package com.capg.sprint1.dadims.model;

public class Distributor {
	long distributorId;
	String distributorName;
	
	public Distributor() {
		// TODO Auto-generated constructor stub
	}

	public Distributor(long distributorId, String distributorName) {
		super();
		this.distributorId = distributorId;
		this.distributorName = distributorName;
	}

	public long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(long distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	@Override
	public String toString() {
		return "Distributor [distributorId=" + distributorId + ", distributorName=" + distributorName + "]";
	}
	
}
