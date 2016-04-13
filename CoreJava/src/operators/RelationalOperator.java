package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		int age = 15;
		int height = 6;
		int marksInJava = 50;

		
		// age > height and marksInJava > 55		50 > 55
		boolean isGoodStudent = (age > height) && (marksInJava++ > 55);
		// OR | ||
		System.out.println(marksInJava);
		
		System.out.println(isGoodStudent);
	}

}
