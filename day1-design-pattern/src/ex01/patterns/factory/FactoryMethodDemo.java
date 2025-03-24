package ex01.patterns.factory;

//1. Interface chung cho phương tiện
interface Vehicle {
	void drive();
}

//2. Các class cụ thể
class Car implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving a Car"); 
	}
}

class Bike implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Riding a Bike");
	}
}

//3. Factory Method - Lớp cơ sở có phương thức tạo object
abstract class VehicleFactory {
	abstract Vehicle createVehicle();
}

//4. Lớp con xác định đối tượng cụ thể sẽ được tạo
class CarFactory extends VehicleFactory {
	@Override
	Vehicle createVehicle() {
		return new Car();
	}
}

class BikeFactory extends VehicleFactory {
	@Override
	Vehicle createVehicle() {
		return new Bike();
	}
}

// demo
public class FactoryMethodDemo {
	public static void main(String[] args) {
		// demo factory method
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.createVehicle();
		car.drive(); // Output: Driving a Car

		// demo factory method
		VehicleFactory bikeFactory = new BikeFactory();
		Vehicle bike = bikeFactory.createVehicle();
		bike.drive(); // Output: Riding a Bike
	}
}
