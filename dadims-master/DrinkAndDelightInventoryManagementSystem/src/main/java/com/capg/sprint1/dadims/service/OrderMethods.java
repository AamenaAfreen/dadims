package com.capg.sprint1.dadims.service;

import java.util.ArrayList;
import java.util.List;

public class OrderMethods extends OrderImpl {

	public void fetchRawMaterialNames() {
		List<String> names=new ArrayList<String>();
		names.add("Salt");
		names.add("Sugar");
		names.add("Tea Powder");
	System.out.println(names);
	}

	public void fetchDistributorId() {
		List<Integer> Ids=new ArrayList<Integer>();
		Ids.add(101);
		Ids.add(102);
		Ids.add(103);
		System.out.println(Ids);
	}
	
	public void fetchProductNames() {
		List<String> names=new ArrayList<String>();
		names.add("Tea");
		names.add("Banana Juice");
		names.add("Butter Milk");
		System.out.println(names);
	}
	
	public void fetchSupplierId() {
		List<Integer> Ids=new ArrayList<Integer>();
		Ids.add(101);
		Ids.add(102);
		Ids.add(103);
		System.out.println(Ids);
	}
}
