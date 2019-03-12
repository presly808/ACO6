package ua.myuber.controller;

import ua.myuber.model.Order;

public interface ClientController extends GeneralController {

	Order create(Order order);

}
