package ua.myuber.test;

import org.junit.Assert;
import org.junit.Test;
import ua.myuber.controller.ClientController;
import ua.myuber.controller.ClientControllerImpl;
import ua.myuber.model.Client;
import ua.myuber.model.Location;
import ua.myuber.model.Order;
import ua.myuber.model.Status;

public class ClientControllerTest {

	@Test
	public void testCreateOrder(){
		Client client = new Client();
		client.setName("Ivan");
		client.setPhone("+380932345234");


		Order order = new Order();
		order.setClient(client);

		Location from = new Location();
		from.setLog(2345.5456);
		from.setLat(2345.2324);

		Location to = new Location();
		to.setLog(2345.5456);
		to.setLat(2345.2324);

		order.setFrom(from);
		order.setTo(to);

		ClientController clientController = new ClientControllerImpl();
		Order actual = clientController.create(order);

		Assert.assertTrue(actual.getStatus() == Status.NEW);
//		System.out.println(actual.getPrice() != 0);
	}

}
