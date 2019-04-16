package ua.myuber.controller;

import ua.myuber.db.MyDB;
import ua.myuber.model.Order;

import java.util.List;

public class DriverControllerImpl extends BaseController implements DriverController {

	public DriverControllerImpl(MyDB myDB) {
		super(myDB);
	}

	@Override public List<Order> getNewOrders() {
		return null;
	}

}
