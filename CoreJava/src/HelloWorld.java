
/**
 * 
 * @author Jayram
 * @since April 7th
 *  Hello This is my first program
 *  which is used to 
 * explain students the concept.
 *
 */
public class HelloWorld {
	// Single line comment
	// public static void main : is a method
	// private 
	
	/**
	 * This is my main Method which just prints Hello Guys...
	 */
	
	/*
	 * This is just for test
	 */
	static public void main(String[] arg) {
		int age = 10;
		
		System.out.println("HelloWorld.main() : Hello Guys..Welcome!!!" + arg[0] +"----"+ arg[1]);
		System.out.println(System.currentTimeMillis());
		
		justPrintMe();
		
		System.out.println(); // sysout ctrl+ space
		System.out.println("HelloWorld.main()"); //systrace
		
	}
	
	public static void justPrintMe(){
		System.out.println("Just print me " + returnYourName());
		System.out.println("HelloWorld.justPrintMe()");
	}
	
	public void imPort(){
		System.out.println("HelloWorld.imPort()");
		System.out.println();

	}
	
	public static String returnYourName(){
		return "Jaryam";
	}
}