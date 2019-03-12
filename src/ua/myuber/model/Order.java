package ua.myuber.model;

public class Order {


	private String id;
	private Location from;
	private Location to;
	private Double price;
	private int lengthMeters;
	private Status status;
	private Client client;
	private Driver driver;

	public Order() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Location getFrom() {
		return from;
	}

	public void setFrom(Location from) {
		this.from = from;
	}

	public Location getTo() {
		return to;
	}

	public void setTo(Location to) {
		this.to = to;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getLengthMeters() {
		return lengthMeters;
	}

	public void setLengthMeters(int lengthMeters) {
		this.lengthMeters = lengthMeters;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override public String toString() {
		return "Order{" + "id='" + id + '\'' + ", from=" + from + ", to=" + to + ", price=" + price + ", lengthMeters=" + lengthMeters + ", status=" + status + '}';
	}
}
