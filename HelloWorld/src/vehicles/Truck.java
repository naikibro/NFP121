package vehicles;

import parts.Wheel;
import parts.Engine;

public class Truck {
	
	public 	Wheel[] wheels;
	Engine engine;

	
	public Truck(String engineModel) {
		Wheel[] wheels;
		Engine engine = new Engine(0, engineModel);

		wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(i + 1, 16, 6, 8);
        }
        
        this.wheels = wheels;
        this.engine = engine;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Truck Details:\n");
		sb.append("Engine: ").append(engine).append("\n");
		sb.append("Wheels:\n");
		for (Wheel wheel : wheels) {
			sb.append("\t").append(wheel).append("\n");
		}
		return sb.toString();
	}
}
