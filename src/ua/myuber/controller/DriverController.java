package ua.myuber.controller;

import ua.myuber.model.Order;

import java.util.List;

public interface DriverController extends GeneralController {


	List<Order> getNewOrders();

}
