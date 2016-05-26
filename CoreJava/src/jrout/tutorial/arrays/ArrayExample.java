package jrout.tutorial.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int jayAge = 10;
		int tanuAge = 20;
		
//		int size = Integer.parseInt(args[0]);
		
		String jayName = "Jayram";
		String tanuName = "Tanu";
		
		printMessage(jayName, tanuName);
		
		String names[] = new String[5];
		names[0] = jayName;
		names[1] = tanuName;
		
		// Create float array (eg: marks) and try to print the first index;
		int myAge  = 89;
		
		/*int ages[] = new int[5]; // byte short int long
		ages[0] = 20;
		ages[1] = 35;
		ages[3] = 45;
		ages[4] = 55;*/
		int ages[] = {20,0,40,56,78};
		
		addAllAges(ages);
		
		addValue(1, 2, 3);
		
		System.out.println(" Length of Array = "+ages.length);
		// Compile Time Error
		// Run time Exception
		
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[3]);
//		System.out.println(ages[5]);
	}
	/**
	 * int ages[] = {20,0,40,56,78};
	 * @param ages
	 */
	public static void addAllAges(int ages[]){
		System.out.println("Total Ages = "+(ages[0] + ages[1]+ ages[2]+ ages[3]+ ages[4]));
	}
	
	public static void printMessage(String name1, String name2){
		System.out.println("Hello "+name1 + " "+ name2);
	}
	
	public static void addValue(int a , int b , int c){
		System.out.println(a+b+c);
	}
}