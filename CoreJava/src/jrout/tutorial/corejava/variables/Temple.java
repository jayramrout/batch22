package jrout.tutorial.corejava.variables;

public class Temple {

	public static void main(String[] args) {
		Piligrims one = new Piligrims("One");
		Piligrims two = new Piligrims("Two");
		
		doDarshan(one);
		doDarshan(two);
		
		System.out.println(one.getName());
		System.out.println(one.count);
		
		Piligrims.count = 100;
		two.setName("Three");
		
		System.out.println(Piligrims.count);
		System.out.println(one.getName());
	}

	public static void doDarshan(Piligrims piligrim){
		System.out.println("Piligrim "+ piligrim.getName() +" is doing Darshan");
	}
}
