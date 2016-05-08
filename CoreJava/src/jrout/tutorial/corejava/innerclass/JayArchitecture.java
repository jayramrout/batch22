package jrout.tutorial.corejava.innerclass;

public class JayArchitecture {

	public void createHouse() {
		System.out.println("Create the base layout");
		KitchenArchitect ka = new KitchenArchitect();
		ka.createKitchen();
		System.out.println("Create a living room");
	}
	class KitchenArchitect {
		private int size = 22;
		private String color = "Blue";

		public void createKitchen() {
			System.out.println("Creating a beautiful kitchen with size " + this.size + " Color " + this.color);
		}
	}
}
