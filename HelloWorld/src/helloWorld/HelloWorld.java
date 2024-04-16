package helloWorld;

import entreprise.Entreprise;
import parts.Engine;
import users.Admin;
import users.Member;
import vehicles.Truck;

public class HelloWorld {

	public static void main(String[] args) {
			
		Entreprise entreprise = new Entreprise("Naiki corporation", 0, null);
		
		System.out.println(" ----- EXEMPLE DE RELATION D'AGGREGATION -----\n");

		// ----- Create users -----
		Admin admin1 = new Admin("Thanos", "Galaxy destroyer");
		Member user1 = new Member("Jake");
		Member user2 = new Member("Sully");
		
		// Aggregation relationship - Entreprise > Admin > User
		entreprise.addAdmin(admin1);
		entreprise.addUser(user1);
		entreprise.addUser(user2);
		
		// Show the entreprise
		System.out.println(entreprise);
		
		// Destroy the entreprise, see the Users and Admin still exist
		entreprise = null;
		
		System.out.println("\n\n ----- SUPRESSION DE L'ENTREPRISE -----");
		System.out.println("entreprise: " + entreprise);
		
		System.out.println("\n\n ----- USERS AND ADMINS -----");
		System.out.println(admin1);
		System.out.println(user1);
		System.out.println(user2);
		
		System.out.println("\n\n ----- EXEMPLE DE RELATION DE COMPOSITION -----\n");
		Truck truck = new Truck("MAN BIG BOY TRUCK", "Cummings V8 7L");
		System.out.println(truck);
		
		System.out.println("\n\n ----- SUPRESSION DU CAMION-----");
		truck = null;
		System.out.println("camion: " + truck);		// truck.wheels et truck.engine n'existent plus
		
		// Renverra une erreur car les objets composant truck n'existent plus
		/*
		System.out.println("roues" + truck.wheels);
		System.out.println("roues" + truck.engine);
		*/
		
	}

	public static void process() {
		System.out.println("ABC");
		process();
	}
	
}
