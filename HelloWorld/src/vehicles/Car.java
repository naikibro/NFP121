package vehicles;

import parts.Engine;

public class Car extends Vehicle implements LandVehicleInterface{
    
    private String carModel;
    private Engine engine;

    public Car(String carModel, String engineModel) {
        super();
        this.carModel = carModel;
        this.engine = new Engine(0, engineModel);
    }

    public Car(String carModel, String engineModel, int maxSpeed, int weight, int height ) {
        super();
        this.carModel = carModel;
        this.engine = new Engine(0, engineModel);
        this.maxSpeed = maxSpeed;
        this.height = height;
        this.weight = weight;
    }    
    
    @Override
    public void controleTechnique() {
        System.out.println("\n\n ----- PASSAGE AU CONTROLE TECHNIQUE ----- \n");
        
        if (this.weight < 2500 && this.height < 3 && this.maxSpeed < 200) {
            System.out.println("Ce véhicule est conforme et passe le contrôle technique");
        } else {
            System.out.println("Ce véhicule n'est pas conforme, veuillez le réhabiliter pour le prochain contrôle technique");
        }
        
        System.out.println("\n\nRésultats du contrôle technique:");
        System.out.println("\t- poids :" + this.weight + " kg");
        System.out.println("\t- hauteur : " + this.height + "m");
        System.out.println("\t- vitesse maximale : " + this.maxSpeed + "km/h");
        
        System.out.println("\n\nLégislation en vigueur:");
        System.out.println("\t- poids < 2500 kg");
        System.out.println("\t- hauteur < 2m");
        System.out.println("\t- vitesse maximale < 200 km/h");
    }

    @Override
    public void roule() {
        System.out.println("Vitesse actuelle: " + this.maxSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car Details: ").append(this.carModel);
        sb.append("\nEngine: ").append(this.engine).append("\n");
        return sb.toString();
    }
}
