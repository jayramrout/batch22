package jrout.tutorial.constructor;

public class Piano {
	String name;
	String color;
	String brand;
	int size;
	
	public Piano(String brand){
		System.out.println(brand + "Got Created");
		this.brand = brand;
	}
	
	public Piano(String brandValue,String colorValue){
		this.brand = brand;
		color = colorValue;
	}
	
	public Piano(String brandValue,String colorValue, String nameVal){
		this(brandValue,colorValue);
		name = nameVal;
	}
	
	public Piano(String brandValue,String colorValue, String nameVal , int sizeVal){
		this(brandValue,colorValue,nameVal);
		size = sizeVal;
	}

	public void printDetails() {
		System.out.println("Piano Details = "+ 
				brand + " " + color + " " + name + " " + size);
		printDetails("Test");
	}
	
	public void printDetails(String name){
		printDetails();
		System.out.println("Details for "+ name);
	}
}