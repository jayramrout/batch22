package jrout.tutorial.corejava.innerclass;

public class InnerClassClientExample {

	public static void main(String[] args) {
		JayArchitecture ja = new JayArchitecture();
		ja.createHouse();
		
		JayArchitecture.KitchenArchitect ka = ja.new KitchenArchitect();
		
		JayArchitecture.KitchenArchitect kaa = ja.new KitchenArchitect();
	
	}
}
