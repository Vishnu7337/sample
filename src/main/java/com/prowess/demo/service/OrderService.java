package com.prowess.demo.service;

import com.prowess.demo.Order;

public class OrderService {
	
	private OrderDao orderDao;


	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	public Order getOrder() {
		return orderDao.getOrders();
	}
	
	public Order getOrderInfo(Order order) {
		return orderDao.getOrdersInfo(order);
	}
	

}
