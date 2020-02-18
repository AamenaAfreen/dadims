package com.capg.sprint1.dadims.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.dadims.model.RawMaterialStock;

public class RawMaterialDaoImpl implements RawMaterialDAO {
	
	Map<String, RawMaterialStock> rawMaterialStocks=new HashMap<String, RawMaterialStock>();
	
	void addSomeStocks() {
		RawMaterialStock stock1=new RawMaterialStock("1154515", "ccc", 50121.0, 100.0, 20, 5235656.0, "101", new Date(), new Date(2020, 0, 15), new Date(2020, 10, 15), "Tested", new Date(2020, 02, 15));
		RawMaterialStock stock2=new RawMaterialStock("1572552", "aaa", 50555.0, 50.0, 30, 555656.0, "107", new Date(), new Date(2020, 0, 10), new Date(2020, 10, 15), "Tested", new Date(2020, 02, 15));
		rawMaterialStocks.put(stock1.getOrderId(), stock1);
		rawMaterialStocks.put(stock2.getOrderId(), stock2);
		
	}

	public String trackRawMaterialOrder(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean doesRawMaterialOrderIdExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean processDateCheck(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		return false;
	}

	public String updateProcessDateInStock(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateRawMaterialStock(RawMaterialStock rawMaterialStock) {
		
		RawMaterialStock st=rawMaterialStocks.get(rawMaterialStock.getOrderId());
		st.setDeliveryDate(rawMaterialStock.getDeliveryDate());
		
		
		return null;
	}

	public boolean doesRawMaterialOrderIdExistInStock(String orderId) {
		// TODO Auto-generated method stub
		return false;
	}

}
