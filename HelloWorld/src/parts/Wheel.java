package parts;

public class Wheel extends Part {

	public int radius, entraxe, width;

	public Wheel(int id) {
		super(id);
	}
	
	public Wheel(int id, int radius, int entraxe, int width) {
		super(id);
		this.radius = radius;
		this.entraxe = entraxe;
		this.width = width;
	}
	
	@Override
	public String toString() {
		
		return "part ID: " + this.id + " - model: " + this.width + "/" + this.entraxe + "R" + this.radius;
	}

}
