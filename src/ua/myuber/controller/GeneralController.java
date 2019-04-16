package ua.myuber.controller;

import ua.myuber.model.Order;

import java.util.List;

public interface GeneralController {


	Order findOrder(String id);

	List<Order> getOrderByUser(String phoneNumber);

	boolean cancelOrder(String id);

}
