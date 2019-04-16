package ua.myuber.controller;

import ua.myuber.db.MyDB;
import ua.myuber.model.Order;

import java.util.ArrayList;
import java.util.List;

public class BaseController implements GeneralController {

	private MyDB myDB;

	public BaseController(MyDB myDB) {
		this.myDB = myDB;
	}

	@Override public Order findOrder(String id) {
		List<Order> orders = myDB.getOrders();

		// foreach
		for (Order order : orders) { // for (int i = 0; i < orders.size; i++) {Order order = orders[i]}
			if(order.getId().equals(id)){
				return order;
			}
		}

		return null;
	}

	@Override public List<Order> getOrderByUser(String phoneNumber) {

		List<Order> found = new ArrayList<>();
		for (Order order :  myDB.getOrders()) { // for (int i = 0; i < orders.size; i++) {Order order = orders[i]}
			if(order.getClient().getPhone().equals(phoneNumber)){
				found.add(order);
			}
		}

		return found;
	}

	@Override public boolean cancelOrder(String id) {
		return false;
	}

	public MyDB getMyDB() {
		return myDB;
	}

	public void setMyDB(MyDB myDB) {
		this.myDB = myDB;
	}
}
