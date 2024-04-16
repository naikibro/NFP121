package vehicles;

abstract public class Vehicle implements LandVehicleInterface{

	String vehicleModel;
	int maxSpeed, weight, height;
	
	abstract public String toString();
}
