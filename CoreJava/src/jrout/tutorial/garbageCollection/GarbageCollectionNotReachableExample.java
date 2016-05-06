package jrout.tutorial.garbageCollection;

import jrout.tutorial.constructor.Piano;

public class GarbageCollectionNotReachableExample {

	public static void main(String[] args) {
		
		Piano p1 = new Piano("Yamana1");
		Piano p2 = new Piano("Yamana2");
		Piano p3 = new Piano("Yamana3");
		
		p1.play();
		System.out.println(p1.brand);
		
		p2.play();
		System.out.println(p2.brand);
		
		// this point the GC came in picture
		System.out.println(p1.brand);
		
		p1.printDetails("Jayram");
	}
}