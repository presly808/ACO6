package ua.myuber.model;

public class Client extends CommonUser {

	public Client() {
	}

	@Override public String  toString() {
		return "Client{" + "name='" + name + '\'' + ", phone='" + phone + '\'' + '}';
	}
}
