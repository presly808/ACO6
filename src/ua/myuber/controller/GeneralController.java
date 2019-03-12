package ua.myuber.controller;

import ua.myuber.model.Order;
import ua.myuber.model.Status;

import java.util.List;

public interface GeneralController {


	Order findOrder(int id);

	List<Order> getOrderByUser(String phoneNumber);

	boolean cancelOrder(int id);

}
