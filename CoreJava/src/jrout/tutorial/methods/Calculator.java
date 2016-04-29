package jrout.tutorial.methods;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		int fistArray[] = {2,3};
//		System.out.println(calc.calc(2, 3) + calc.calc(2, 3, 4));
		
		//System.out.println(calc.calc(fistArray));
		
		System.out.println(calc.calc(3,4,5,7,7,8,9,5,4,3));
		
	}

	//Method overloading
	public int calc(int i , int j){
		System.out.println("Hello this is 2 args ");
		return i+ j;
	}
	
	public int calc(int i , int j,int k){
		System.out.println("Hello this is 3 args ");
		return i + j + k ;
	}
	
	/*public int calc(int [] array){
		int temp = 0;
		for(int val : array){
			temp+= val;
		}
		return temp;
	}*/
	
	public int calc(int...array){
		System.out.println("Hello this is Variable Args");
		int temp = 0;
		for(int val : array){
			temp+= val;
		}
		return temp;
		
	}

}
