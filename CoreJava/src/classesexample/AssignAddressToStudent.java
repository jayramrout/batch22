package classesexample;

public class AssignAddressToStudent {

	public static void main(String[] args) {

		Student studMeena = new Student();
		studMeena.studName = "Meena";
		studMeena.studId = 24;
		studMeena.studGrade = "Sixth";
		
		// CODE STARTS HERE
		// Please check on this if this works !!!...
		studMeena.address.state = "North Carolina";
		// CODE ENDS HERE
		System.out.println(studMeena.address.country);// INDIA , USA
		
	}
}