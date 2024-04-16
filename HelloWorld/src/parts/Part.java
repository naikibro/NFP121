package parts;

public abstract class Part {

	public int id;

	public Part(int id) {
		super();
		this.id = id;
	}
	
	public abstract String toString();
}
