package classesexample;

public class SchoolClient {

	public static void main(String[] args) {
		Student studMaha = new Student();
		studMaha.studName = "Maha";
		studMaha.studId = 23;
		studMaha.studGrade = "Fifth";
		
		Student studMaha2 = studMaha;
		
		Student studMeena = new Student();
		studMeena.studName = "Meena";
		studMeena.studId = 24;
		studMeena.studGrade = "Sixth";
		
		Student studVijay = new Student();
		studVijay.studName = "Vijay";
		studVijay.studId = 28;
		studVijay.studGrade = "Seventh";

//		System.out.println(studVijay.studName);
//		System.out.println(studMeena.studName);
		System.out.println(studMaha.studName);
		
		//Type mismatch: cannot convert from String to Student
		studMaha.studName = "MahaLakshmi";
		
		System.out.println(studMaha.studName);
		
//		System.out.println(studLakshmi.studName +"::" + studLakshmi.studId);
		
		Student studLakshmi = studMaha;
		
		System.out.println(studLakshmi.studName);
		
	}
}
