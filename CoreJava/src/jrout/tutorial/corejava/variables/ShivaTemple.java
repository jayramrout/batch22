package jrout.tutorial.corejava.variables;

public class ShivaTemple {

	public static void main(String[] args) {
		Piligrims one = new Piligrims("One");
		Piligrims two = new Piligrims("Two");
		
		ShivaTemple temple = new ShivaTemple();
		temple.doDarshan(one);
		temple.doDarshan(two);
	}

	public void doDarshan(Piligrims piligrim){
		System.out.println("Piligrim "+ piligrim.getName() +" is doing Darshan");
		
	}
}
