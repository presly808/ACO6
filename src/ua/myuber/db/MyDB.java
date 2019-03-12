package ua.myuber.db;

import ua.myuber.model.Client;
import ua.myuber.model.Driver;
import ua.myuber.model.Order;

import java.util.List;

public interface MyDB {

	List<Order> getOrders();

	List<Client> getClients();

	List<Driver> getDrivers();

	void setOrders(List<Order> orders);

	void setClients(List<Client> clients);

	void setDrivers(List<Driver> drivers);

}
