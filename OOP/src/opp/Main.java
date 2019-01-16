package opp;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		System.out.println(vehicle1.getName());
		vehicle1.setName("PMW");
		System.out.println(vehicle1.getName());
		System.out.println(vehicle1.COUNT);
		
		Vehicle vehicle2 = new Vehicle("civic", "black", "2018", "honda", "80");
		System.out.println(vehicle2.getColor());
		vehicle2.setColor("Green");
		System.out.println(vehicle2.getColor());
		System.out.println(vehicle2.getSpeed());
		System.out.println(vehicle1.COUNT);
		
		System.out.println(Vehicle.getVehicle());
		
		Car car1 = new Car("civic", "white", "2019", "900", "RMA", true, false);
		System.out.println(car1.isLedSscreen());
		System.out.println(car1.getName());
		
		Vehicle vehicle3 = new Vehicle("civic3", "red", "2012", "honda3", "80");
		System.out.println(vehicle3.getInfo());
	
		Vehicle vehicle4 = new Car("civic3", "red", "2012", "honda3", "80", true, false);
		System.out.println(vehicle4.getInfo());
		
		Vehicle vehicle5 = new Bike("civic3", "red", "2012", "honda3", "80",  false);
		System.out.println(vehicle5.getInfo());

	}

}
