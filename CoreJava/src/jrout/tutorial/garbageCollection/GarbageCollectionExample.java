package jrout.tutorial.garbageCollection;

import jrout.tutorial.constructor.Piano;

public class GarbageCollectionExample {

	public static void main(String[] args) {
		
		int index = 0;
		for(;;){
			Piano p = new Piano("Yamana"+index++);
		}
	}
}