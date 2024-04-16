package users;

public class Member extends User{
	
	// ----- C O N S T R U C T O R S -----
	public Member(String name) {
		super(name);
	}
	
	public Member() {
		super("undefined");
	}

	@Override
	public String present() {
		return "Hello member : " + this.name + " the normal member";
	}
	
	@Override
	public String toString()
	{
		return this.name + " the normal member";
	}
}
