package vehicles;

import parts.Wheel;
import parts.Engine;

public class Truck extends Vehicle implements LandVehicleInterface{
	
	public 	Wheel[] wheels;
	Engine engine;
	
	
	public Truck(String truckModel, String engineModel) {
		Wheel[] wheels;
		Engine engine = new Engine(0, engineModel);

		wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(i + 1, 16, 6, 8);
        }
        
        this.vehicleModel = truckModel;
        this.wheels = wheels;
        this.engine = engine;
        this.maxSpeed = 110;
        this.height = 3;
        this.weight = 4000;
	}
	
	public Truck(String truckModel, String engineModel, int maxSpeed, int weight, int height) {
		Wheel[] wheels;
		Engine engine = new Engine(0, engineModel);

		wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(i + 1, 16, 6, 8);
        }
        
        this.vehicleModel = truckModel;
        this.wheels = wheels;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.height = height;
        this.weight = weight;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Truck Details:").append(this.vehicleModel);
		sb.append("\nEngine: ").append(engine).append("\n");
		sb.append("Wheels:\n");
		for (Wheel wheel : wheels) {
			sb.append("\t").append(wheel).append("\n");
		}
		return sb.toString();
	}

	@Override
	public void controleTechnique() {
		
		System.out.println("\n\n ----- PASSAGE AU CONTROLE TECHNIQUE ----- \n");
		
		if (this.weight < 4500 && this.height < 4 && this.maxSpeed < 250 )
		{
			System.out.println("Ce véhicule est conforme et passe le contrôle technique");
		}else {
			System.out.println("Ce véhicule n'est pas conforme, veuillez le réhabiliter pour le prochain contrôle technique");
		}
		
		System.out.println("\n\nRésultats du contrôle technique:");
		System.out.println("\t- poids :" + this.weight +" kg");
		System.out.println("\t- hauteur : " + this.height +"m");
		System.out.println("\t- vitesse maximale : " + this.maxSpeed + "km/h");
		
		System.out.println("\n\nLégislation en vigueur:");
		System.out.println("\t- poids < 4500 kg");
		System.out.println("\t- hauteur < 4m");
		System.out.println("\t- vitesse maximale < 250 km/h");
		
	}

	@Override
	public void roule() {
		System.out.println("Vitesse actuelle: " + this.maxSpeed);		
	}
}
