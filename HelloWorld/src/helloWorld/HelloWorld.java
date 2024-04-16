package helloWorld;

import users.User;
import users.Admin;

public class HelloWorld {

	public static void main(String[] args) {
			
		// ----- Create users -----
		Admin admin1 = new Admin("Thanos", "Galaxy destroyer");
		
		// Display the users and admins
		admin1.present();
		
		// ----- Heap space OutOfMemoryError -----
		/*
		System.out.println("Integer[] array = new Integer[100000 * 100000];...");
		Integer[] array = new Integer[100000 * 100000];
		System.out.println("Integer[] array = new Integer[100000 * 100000];DONE");
		*/
		
		// ----- CallStack overflow -----
		// process();
	}

	public static void process() {
		System.out.println("ABC");
		process();
	}
	
}
