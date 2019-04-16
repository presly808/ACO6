package ua.myuber.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.myuber.controller.BaseController;
import ua.myuber.db.MyDBMemory;
import ua.myuber.model.Client;
import ua.myuber.model.Driver;
import ua.myuber.model.Order;
import ua.myuber.model.Status;

import java.util.List;

import static org.junit.Assert.*;

/**
 * TDD (Test Driven Development)
 */
public class BaseControllerTest {

	private BaseController controller;

	@Before
	public void beforeEachTest(){
		controller = initController();
	}

	@After
	public void afterEachTest(){
		controller = null;
	}

	@Test public void findOrder() throws Exception {
		Order order = controller.findOrder("1");
		Assert.assertNotNull(order);
	}

	@Test public void getOrderByUser() throws Exception {
		List<Order> orderByUser = controller.getOrderByUser("+380933091219");
		Assert.assertEquals(2, orderByUser.size());
	}

	@Test public void cancelOrder() throws Exception {

		boolean res = controller.cancelOrder("1");
		Assert.assertTrue(res);

	}

	private BaseController initController() {
		Client client = new Client();
		client.setName("Ivan");
		client.setPhone("+380933091219");

		Driver driver = new Driver();
		driver.setName("Kolia");
		driver.setPhone("+380956784345");

		Order e = new Order();
		e.setId("1");
		e.setPrice(23.23);
		e.setStatus(Status.NEW);

		e.setClient(client);

		e.setDriver(driver);

		Order e2 = new Order();
		e2.setId("2");
		e2.setPrice(23.23);
		e2.setStatus(Status.NEW);
		e2.setClient(client);
		e2.setDriver(driver);

		MyDBMemory myDBMemory = new MyDBMemory();
		myDBMemory.getOrders().add(e);
		myDBMemory.getOrders().add(e2);

		return new BaseController(myDBMemory);
	}

}