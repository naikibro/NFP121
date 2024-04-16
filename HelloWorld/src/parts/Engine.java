package parts;

public class Engine extends Part{

	public String model;
	
	public Engine(int id, String model) {
		super(id);
		this.model = model;
	}	
	
	@Override
	public String toString() {
	
		return "part ID: " + this.id + " - model: " + this.model;
	}
}
