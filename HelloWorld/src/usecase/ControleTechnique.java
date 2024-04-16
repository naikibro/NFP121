package usecase;

import java.util.ArrayList;

import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;

public class ControleTechnique {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Truck truck1 = new Truck("MAN BIG BOY TRUCK", "Cummings V8 7L");
		Truck truck2 = new Truck("MAN FATASS BOY TRUCK", "Cummings V8 12L", 50, 5000, 7);
		Truck truck3 = new Truck("MAN SMALLASS BOY TRUCK", "Cummings V6 4.2L", 251, 4000, 3);
		
		Car car1 = new Car("Ferrari 458", "V8 dyno", 300, 1000, 2);
		Car car2 = new Car("Jeep wrangler", "6L inline bi-turbo", 190, 1500, 2);
		Car car3 = new Car("Citroen C1", "1.1L 3cyl HDI", 170, 1000, 2);
		
		vehicles.add(truck1);
        vehicles.add(truck2);
        vehicles.add(truck3);
        
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);

        int i = 1;
		for (Vehicle vehicle : vehicles) {
			System.out.println("\n\n ----- VEHICULE n° " + i++ + " -----");
			System.out.println(vehicle);
			vehicle.controleTechnique();
		}
		
	}

}
