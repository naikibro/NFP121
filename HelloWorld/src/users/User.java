package users;

abstract public class User {
	public String name;

	public User()
	{
		
	}
	
	public User(String name) {
		super();
		this.name = name;
	}
	
	abstract String present();
}
