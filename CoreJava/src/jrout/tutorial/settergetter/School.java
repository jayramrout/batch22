package jrout.tutorial.settergetter;

public class School {

	public static void main(String[] args) {
		Student stud = new Student();
		stud.setSName("Jayram"); 
		stud.setSheight(-3);
		
		System.out.println("name =" + stud.getSName() +" height =" + stud.getSheight());
		
	}

}
