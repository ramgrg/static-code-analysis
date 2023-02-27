import java.util.ArrayList;

public class CarDetails {
	public static final double TAX_RATE = 0.02;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cars = new ArrayList<>();
		Car corollaCar = new Car("Toyota corolla", "AJY123D03", 2009, 16, 21500);
		Car polOCar = new Car("Volkswagen polo", "VWY123POL03", 2015, 19, 14000);
		cars.add(polOCar);
		cars.add(corollaCar);
		showCarDetails(cars);
	}
	public static double taxableAmount(float price) {
		double taxablePrice = price * TAX_RATE;
		return taxablePrice;
	}
	public static void showCarDetails(ArrayList<Car> cars) {
		for (Car car : cars) {
			System.out.println("-----------Details of cars----------------");
			System.out.println("Car Model: " + car.getModel());
			System.out.println("Car identification number: " + car.getVehicleIdentification());
			System.out.println("Car build year: " + car.getBuildYear());
			System.out.println("Car mileage: " + car.getMileage());
			System.out.println("Car total price: " + car.getPrice() + taxableAmount(car.getPrice()));
		}
	}
}
