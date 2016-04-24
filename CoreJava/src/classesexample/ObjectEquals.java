package classesexample;

public class ObjectEquals {

	public static void main(String[] args) {
		Student studMeena = new Student();
		studMeena.studName = "Meena";
		studMeena.studId = 24;
		studMeena.studGrade = "Sixth";
		
		Student studJay = new Student();
		studJay.studName = "Meena";
		studJay.studId = 24;
		studJay.studGrade = "Sixth";
		
		Student studRoopkala = studJay;
		
//		System.out.println(studMeena.studName.equals(studJay.studName));
		System.out.println(studMeena.equals(studJay));
		System.out.println(studMeena == studJay);
		
		System.out.println(studJay.equals(studRoopkala));// as of now this will return false
		System.out.println(studJay == studRoopkala);
		
		System.out.println(44456 == 898989);
		
		int val1 = 3;
		int val2 = 3;
		System.out.println(val1 == val2);
	}
}