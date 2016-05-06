package jrout.tutorial.objectasparameter;

import jrout.tutorial.constructor.Piano;

public class ObjectAsParameterExample {

	public static void main(String[] args) {
		Piano p = new Piano("Yamaha");
		Piano c = new Piano("Casio");
		
		ObjectAsParameterExample oape = new ObjectAsParameterExample();
		
		System.out.println("Before Change " + p.brand);
		
		oape.changeBrand(p);
		oape.changeColor(p);

		oape.changeBrand(c);
		oape.changeColor(c);

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
	
	public void changeBrand(Piano piano){
		piano.brand = "Lenovo";
	}
	
	public void changeColor(Piano piano){
		piano.color = "Black";
	}
	public void calc(int i , int j){
		i = 3;
		j = 6;
	}
	
}
