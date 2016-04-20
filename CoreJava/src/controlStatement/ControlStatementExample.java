package controlStatement;

public class ControlStatementExample {

	public static void main(String[] args) {
//		ControlStatementExample.whileLoop();
		doWhileLoop();
	}
	
	public static void doWhileLoop() {
		System.out.println("Entering do while loop");
		
		int ages[] = { 20, 30, 40 };
		int index = 0;
		
		do {
			System.out.println(ages[index++]);
		} while (index < ages.length);
		
	}
	
	
	public static void whileLoop() {

		int ages[] = { 20, 30, 40 };
		int index = 0;
		
		while(index < ages.length){
			System.out.println(ages[index++]);
		}
		
	}

	public static void ifElseCondition() {

		int ages[] = { 20, 30, 40 };
		int totalMarks = 59;

		for (int age : ages) {
			// boolean is20 = (age == 20);

			if (age == 20) {
				System.out.println("I am still Young");
				System.out.println("I play football");
			} else if (age == 30) {
				System.out.println("Wow I have reached 30 !!!");
			} else if (age == 40) {
				System.out.println("Oops I have reached 40 ");
			} else {
				System.out.println("You are not yet born.....");
			}

			/*
			 * if(age == 20) System.out.println("I am still Young");
			 * System.out.println("I play football"); if(age == 30)
			 * System.out.println("Wow I have reached 30 !!!");
			 */ }

		/*
		 * for(int i = 0 ; i < ages.length ; i++){ int age = ages[i];
		 * System.out.println(age); }
		 */

	}
}
