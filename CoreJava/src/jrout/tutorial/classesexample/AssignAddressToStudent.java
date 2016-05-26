package jrout.tutorial.classesexample;

import jrout.tutorial.operators.Address;

public class AssignAddressToStudent {

	public static void main(String[] args) {

		Student studMeena = new Student();
		studMeena.studName = "Meena";
		studMeena.studId = 24;
		studMeena.studGrade = "Sixth";
		
		// CODE STARTS HERE
		// Please check on this if this works !!!...
		
		Address address = new Address();
		address.state = "North Carolina";

		studMeena.address = address;
		
//		studMeena.address.state = "North Carolina";
		// CODE ENDS HERE
		System.out.println(studMeena.address.state);// INDIA , USA
		
	}
}