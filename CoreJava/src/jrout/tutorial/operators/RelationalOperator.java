package jrout.tutorial.operators;

public class RelationalOperator {

	public static void main(String[] args) {
		int age = 15;
		int height = 6;
		int marksInJava = 50;

		
		// age > height and marksInJava > 55		50 > 55
		boolean isGoodStudent = (age > height) && (marksInJava++ > 55);
		// OR | ||
		//System.out.println(marksInJava);
		//System.out.println(isGoodStudent);
		equalsTesting();
		
	}
	
	public static void equalsTesting(){
		String name1 = new String("Jayram");
		String name2 = new String("Jayram");
		
		int age = 23, height = 45;
		
		System.out.println(name1.equals(name2));
		System.out.println(age == height);
		ternaryOperatorExample();
	}
	
	public static void ternaryOperatorExample(){
		int age = 10;
		int height = 5;
		// if age > height == GOOD
		
		System.out.println(age > height);
		
		String value = (age > height) ? "Good" : "Bad";
		System.out.println(value);
	}
	
}
