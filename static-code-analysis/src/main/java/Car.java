
public class Car {
	String model, vehicleIdentification;
	int buildYear, mileage;
	float price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String vehicleIdentification, int year, int mileage, float price) {
		super();
		this.model = model;
		this.vehicleIdentification = vehicleIdentification;
		this.buildYear = year;
		this.mileage = mileage;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVehicleIdentification() {
		return vehicleIdentification;
	}

	public void setVehicleIdentification(String vehicleIdentification) {
		this.vehicleIdentification = vehicleIdentification;
	}

	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int year) {
		this.buildYear = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
