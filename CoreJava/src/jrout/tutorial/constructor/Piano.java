package jrout.tutorial.constructor;

public class Piano {
	public String name;
	public String color;
	public String brand;
	int size;
	
	public Piano(String brand){
		System.out.println(brand + " Got Created");
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
		int cost = 100;
		System.out.println("Piano Details = "+ 
				brand + " " + color + " " + name + " " + size);
	}
	
	public void printDetails(String name){
		this.printDetails();
		System.out.println("Details for "+ name);
	}
	
	protected void finalize() throws Throwable {
		System.out.println("I am been destroyed" + brand);
		unplugPowerSource();
	}
	
	public void createPowerSource(){
		System.out.println("Power Source has been created...");
	}
	
	public void unplugPowerSource(){
		System.out.println("Un plug power source...");
	}
	
	public void play(){
		createPowerSource();
		System.out.println("Piano.play() :: I am playing lalalalala" );
	}
}