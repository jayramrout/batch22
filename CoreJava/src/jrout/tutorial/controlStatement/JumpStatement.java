package jrout.tutorial.controlStatement;

class AssignementApril19 {
	public static void main(String[] args) {
		int details[][] = { { 30, 5 }, { 20, 4 }, { 34, 8 } };
		for (int[] val : details) {
			System.out.println(val[0] +" "+ val[1]);
		}
	}
}

public class JumpStatement {
	
	public static void main(String[] args) {
		
		/*
		 * for(int i = 0; i < 10 ; i++){ if(i == 3){ //continue; break; }
		 * System.out.println("Value = "+ i); }
		 */
		
		System.out.println(11%2);
		
/*		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0)
				continue;
			System.out.println("");
		}
*/
	}

	
}
