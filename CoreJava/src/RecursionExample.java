

public class RecursionExample {

	public static void main(String[] args) {
		RecursionExample fact = new RecursionExample();
		System.out.println(fact.fact(3));
		
		System.out.println(fact.fact1(3));
		
	}
	
	/**
	 * 3 (3*2*1)
	 * @param n
	 * @return
	 */
	public int fact(int n) {
		int result;
		if(n == 1){
			return 1;
		} 
		result = n * fact(n-1);	
		
		return result;
	}
	
	public int fact1(int n){			// 3
		
		return n * fact2(n-1);		// 2
	}
	
	public int fact2(int n){	// 2
		return n * fact3(n-1);	// 1 
	}
	
	public int fact3(int n){	// 1
			return 1;
	}
	
}
