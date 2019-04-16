package ua.myuber.controller;

import ua.myuber.db.MyDB;
import ua.myuber.model.Order;
import ua.myuber.model.Status;

import java.util.List;

public class ClientControllerImpl extends BaseController implements ClientController {

	public ClientControllerImpl(MyDB myDB) {
		super(myDB);
	}

	@Override public Order create(Order order) {

		// do validation
		if(order == null) {
			System.out.println("Order is null");
			return null;
		}

		if(order.getClient() == null || order.getFrom() == null || order.getTo() == null) {
			System.out.println("Order is not full to save in the db");
			return null;
		}

		order.setStatus(Status.NEW);


		return order;
	}

}
