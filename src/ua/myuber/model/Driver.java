package ua.myuber.model;

public class Driver extends CommonUser {

	private Car car;
	private int rate; // 0-5

	public Driver() {
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override public String toString() {
		return "Driver{" + "name='" + name + '\'' + ", phone='" + phone + '\'' + ", car=" + car + ", rate=" + rate + '}';
	}
}
