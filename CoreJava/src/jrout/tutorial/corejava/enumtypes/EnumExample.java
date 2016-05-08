package jrout.tutorial.corejava.enumtypes;

public class EnumExample {
	static final String coffeeSmall = "SMALL";
	static final String coffeeLarge = "LARGE";
	static final String coffeeMedium = "MEDIUM";
	
	public static void main(String[] args) {
		
		EnumExample.orderCoffee(coffeeSmall);
		EnumExample.orderCoffee("JayramCoffee");
	}
	
	public static void orderCoffee(String coffeeSize){
		if(coffeeSize.equals(coffeeSmall)){
			System.out.println("I am going to server small size Coffee");
		}else if(coffeeSize.equals(coffeeMedium)){
			System.out.println("I am going to server medium size Coffee");
		}else if(coffeeSize.equals(coffeeLarge)){
			System.out.println("I am going to server large size Coffee");
		}
	}
	
}