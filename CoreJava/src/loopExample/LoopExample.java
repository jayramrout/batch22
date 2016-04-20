package loopExample;

public class LoopExample {

	public static void main(String[] args) {
		int ages[] = {20,30,40};
		int totalAge = 0;
		
		/*for(int i = 0 ; i < ages.length ; i++){
			System.out.println(ages[i]);
		}*/
		
		//Enhanced For Loop
		for(int val : ages){
			System.out.println(val);
		}
		
//		System.out.println("Total Age = " + totalAge);
		
//		System.out.println(ages[0] + ages[1]+ages[2]);
		
		
	}

}
