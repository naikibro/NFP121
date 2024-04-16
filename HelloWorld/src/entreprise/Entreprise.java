package entreprise;

import java.util.ArrayList;
import java.util.List;

import users.Admin;
import users.Member;

public class Entreprise {
	
	public String name;
	public int id;
	
	// Aggregation relationship - Entreprise > Admin > User
	// Every object live independantly from each other
	public List<Admin> pdg;
	public List<Member> members;
	
	// ----- C O N S T R U C T O R S -----
	public Entreprise(String name, int id, Admin pdg) {
		super();
		this.name = name;
		this.id = id;
		this.pdg = new ArrayList<>();
        this.members = new ArrayList<>();
 	}	
	
	@Override
    public String toString() {
        return "Entreprise{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", \n\tpdg=\n\t\t" + pdg +
                ", \n\tmembers=\n\t\t" + members +
                '}';
    }
	
	// ----- G E T T E R S - S E T T E R S -----
	public void addAdmin(Admin admin)
	{
		pdg.add(admin);
	}
	
	public void addUser(Member member)
	{
		members.add(member);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Admin> getPdg() {
		return pdg;
	}

	public void setPdg(List<Admin> pdg) {
		this.pdg = pdg;
	}

	public List<Member> getUsers() {
		return members;
	}

	public void setUsers(List<Member> members) {
		this.members= members;
	}
}
