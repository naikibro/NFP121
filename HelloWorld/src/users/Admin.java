package users;

public class Admin extends User{

	public String title;

	// ----- C O N S T R U C T O R S -----
	public Admin(String name) {
		super(name);
	}
	
	public Admin(String name, String title) {
		super(name);
		this.title = title;
	}
	
	// ----- G E T T E R S - S E T T E R S -----
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String present()
	{
		return "Hello admin : " + this.name + " the " + this.title;
	}
	
	@Override
	public String toString()
	{
		return this.name + " the " + this.title;
	}

	
}
