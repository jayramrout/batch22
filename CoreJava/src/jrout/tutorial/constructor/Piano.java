package jrout.tutorial.constructor;

public class Piano {
	String name;
	String color;
	String brand;
	int size;
	
	public Piano(String brandValue){
		brand = brandValue;
	}
	
	public Piano(String brandValue,String colorValue){
		brand = brandValue;
		color = colorValue;
	}
}