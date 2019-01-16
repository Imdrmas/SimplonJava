package opp;

public class Car extends Vehicle {
	private boolean powerSteering = false;
	private boolean ledSscreen = true;
	
	public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen) {
		super(name, color, model, company, engine);
		this.powerSteering = powerSteering;
		this.ledSscreen = ledScreen;	
	}
	
	public String getName() {
		return "Name of your vehicle is: " + super.getName();
	}

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public boolean isLedSscreen() {
		return ledSscreen;
	}

	public void setLedSscreen(boolean ledSscreen) {
		this.ledSscreen = ledSscreen;
	}
	public String getInfo() {
		return "This is a Car";
	}

}
