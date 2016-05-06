package arrays;

public class Array2DExample {

	public static void main(String[] args) {
		int jayAge = 10;
		int jayGrade = 3;
		
		int tanuAge = 20;
		int tanuGrade = 4;
		
		int jayDetails[] = new int[2];
		jayDetails[0] = jayAge;
		jayDetails[1] = jayGrade;
		
		int tanuDetails[] = {tanuAge, tanuGrade};
		
		int nirmalaDetails[] = {15, 6};
		
		int details[][] = {
				jayDetails,
				{20, 4}, 
				nirmalaDetails
				};
		
		
/*		System.out.println("JayAge = " + jayDetails[0]);
		System.out.println("JayGrade = " + jayDetails[1]);
		
		System.out.println("TanuAge = " + tanuDetails[0]);
		System.out.println("TanuGrade = " + tanuDetails[1]);
*/		
//		calcAgeAndGrade(jayDetails, tanuDetails);
		
		calcAgeAndGrade(details);
	}
	
	/*public static void calcAgeAndGrade(int firstDetails[] , int secondDetails[]){
		System.out.println("ages total = "+(firstDetails[0]+ secondDetails[0]));
		System.out.println("grade total ="+(firstDetails[1]+ secondDetails[1]));
	}*/
	
	/**
	 * int details[][] = {
				{10,3},
				{20, 4}, 
				nirmalaDetails
				};
	 * @param details
	 * 
	 * int details[][] = {
				jayDetails,
				{20, 4, 55}, 
				nirmalaDetails
				};
	 */
	public static void calcAgeAndGrade(int details[][]){
		System.out.println("Age = " + details[0][0] +" Grade = " + details[0][1]);
		System.out.println("Age = " + details[1][0] +" Grade = " + details[1][1]);
		System.out.println("Age = " + details[2][0] +" Grade = " + details[2][1]);
		
		System.out.println("Age = " + (details[0][0] + details[1][0] + details[2][0]));
	}
}