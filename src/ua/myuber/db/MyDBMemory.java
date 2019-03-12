package ua.myuber.db;

import ua.myuber.model.Client;
import ua.myuber.model.Driver;
import ua.myuber.model.Order;

import java.util.ArrayList;
import java.util.List;

public class MyDBMemory implements MyDB {

	private List<Order> orders;
	private List<Client> clients;
	private List<Driver> drivers;

	public MyDBMemory() {
		orders = new ArrayList<>();
		clients = new ArrayList<>();
		drivers = new ArrayList<>();
	}

	@Override public List<Order> getOrders() {
		return orders;
	}

	@Override public List<Client> getClients() {
		return clients;
	}

	@Override public List<Driver> getDrivers() {
		return drivers;
	}

	@Override public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}
}
