package jrout.tutorial.corejava.enumtypes;

import jrout.tutorial.constructor.Piano;

enum Coffee {
	SMALL , MEDIUM, LARGE;
}

enum Days {
	MONDAY(12), TUE(15), FRIDAY(25);
	private int value;
	private Days(int value) {
		this.value = value;
	}
	
	public int value(){
		return this.value;
	}
}

public class CoffeeExample {
	static final String coffeeSmall = "SMALL";
	static final String coffeeLarge = "LARGE";
	static final String coffeeMedium = "MEDIUM";
	
	final int age[] = {23,242,42};
	
	public static void main(String[] args) {
		
//		orderCoffee(Coffee.SMALL);
//		orderCoffee(Coffee.LARGE);
//		orderCoffee(null);
		
		printDay(Days.MONDAY);
	}
	
	public static void orderCoffee(Coffee cof){
		if(cof.equals(Coffee.SMALL)){
			System.out.println("I am going to server small size Coffee");
		}else if(cof.equals(Coffee.MEDIUM)){
			System.out.println("I am going to server medium size Coffee");
		}else if(cof.equals(Coffee.LARGE)){
			System.out.println("I am going to server large size Coffee");
		}
	}
	
	public static void printDay(Days days){
		
		if (days.equals(Days.MONDAY)){
			System.out.println("Monday belongs to " + days.value());
		}else if (days.equals(Days.TUE)){
			System.out.println("Tuesday belongs to "+ days.value());
			// Tuesday belongs to 15
		}else if (days.equals(Days.FRIDAY)){
			System.out.println("Friday belongs to "+days.value());
		}
	}
	
/*public static void printDay(int dayNumber){
		
		if (dayNumber == 12){
			System.out.println("Monday belongs to " + dayNumber);
		}else if (dayNumber == 15){
			System.out.println("Tuesday belongs to "+ dayNumber);
			
			// Tuesday belongs to 15
		}else if (dayNumber == 25){
			System.out.println("Friday belongs to "+dayNumber);
		}
	}*/
	/*public static void printDay(Days dayNumber){
		if (dayNumber.equals(Days.MONDAY)){
			System.out.println("Monday");
		}else if (dayNumber.equals(Days.TUE)){
			System.out.println("Tuesday");
		}
	}*/
	
}