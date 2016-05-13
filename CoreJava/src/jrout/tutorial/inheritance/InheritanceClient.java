package jrout.tutorial.inheritance;

public class InheritanceClient {

	public static void main(String[] args) {
		/*Person per = new Person("Tanu");
		per.printDetails();*/
		
		Clerk clerk = new Clerk("Raju","Response for Printing");
		clerk.printDetails();
		
		Manager man = new Manager("Vijay","Managing the Project");
		man.printDetails();

		SportsPerson sportsPerson = new SportsPerson("Jayram");
	}
}
