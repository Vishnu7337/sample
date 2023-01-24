package com.prowess.demo.service;

import com.prowess.demo.Order;

public class OrderDao {

	public Order getOrders() {
		Order order =new Order("sample", 343243L);
		//db.save
		
		return order;
	}
	
	public Order getOrdersInfo(Order order) {
		//Order order =new Order("sample", 343243L);
		//db.save
		Long orderNumber =order.getOrderNumber();
		//db.sve
		Long odre = orderNumber+34;
		order.setOrderNumber(odre);
		return order;
	}

}
