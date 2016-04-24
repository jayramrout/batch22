package classesexample;

public class ObjectReferenceExample {

	public static void main(String[] args) {
		Student studMeena = new Student();
		studMeena.studName = "Meena";
		studMeena.studId = 24;
		studMeena.studGrade = "Sixth";
		
		Student studJay = new Student();
		studJay.studName = "Jay";
		studJay.studId = 66;
		studJay.studGrade = "Ninth";
		
		studJay = studMeena;
		
		System.out.println(studJay.studName);
		
	}

}
