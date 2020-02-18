package com.capg.sprint1.dadims.service;
import java.util.Scanner;

public class OrderImpl extends Order{
Scanner in=new Scanner(System.in);
	@Override
	void placeOrder() {
		System.out.println("Enter 1:raw material order \n 2:Product order");
		int s=in.nextInt();
		switch(s)
		{
		case 1:
			System.out.println("Raw Materials Order");
			OrderMethods info=new OrderMethods();
			System.out.println("Display list of rawMaterials");
			info.fetchRawMaterialNames();
			info.fetchDistributorId();
		    break;
		 
		case 2:
			System.out.println("Product Order");
			OrderMethods info1=new OrderMethods();
			info1.fetchProductNames();
			info1.fetchSupplierId();
		}
	}
	@Override
	void updateOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayOrder() {
		
		
	}

	@Override
	void displaySupplierDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayDistributorDetails() {
		// TODO Auto-generated method stub
		
	}

}
