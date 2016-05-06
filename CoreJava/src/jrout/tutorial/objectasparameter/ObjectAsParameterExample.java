package jrout.tutorial.objectasparameter;

import jrout.tutorial.constructor.Piano;

public class ObjectAsParameterExample {

	public static void main(String[] args) {
		Piano p = new Piano("Yamaha");
		
		ObjectAsParameterExample oape = new ObjectAsParameterExample();
		
		System.out.println("Before Change " + p.brand);
		oape.changeMe(p);
		System.out.println("After Change " + p.brand);
		
		String name = "Jayram";
		System.out.println(" Before "+name);
		oape.printDetails(name);
		System.out.println(" After "+name);
		
		int i = 10;
		int j = 45;
		oape.calc(i, j);
		System.out.println(i);
		System.out.println(j);
	}
	
	public void printDetails(String name){
		name = "Rout";
	}
	
	public void changeMe(Piano piano){
		piano.brand = "Lenovo";
	}
	
	public void calc(int i , int j){
		i = 3;
		j = 6;
	}
	
}
