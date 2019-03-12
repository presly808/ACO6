package ua.myuber.model;

public class Car {

	private String number;
	private String model;

	public Car() {
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override public String toString() {
		return "Car{" + "number='" + number + '\'' + ", model='" + model + '\'' + '}';
	}


}
