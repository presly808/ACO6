package ua.myuber.controller;

import ua.artcode.test_package.DB;
import ua.myuber.model.Order;

import java.util.List;

public class BaseController implements GeneralController {

	@Override public Order findOrder(int id) {
		return null;
	}

	@Override public List<Order> getOrderByUser(String phoneNumber) {
		return null;
	}

	@Override public boolean cancelOrder(int id) {
		return false;
	}
}
