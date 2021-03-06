package jrout.tutorial.constructor;

import jrout.tutorial.corejava.constants.ApplicationConstants;

public class PianoClient {

	public static void main(String[] args) {
		
		Piano yamaha = new Piano("Yamaha");
//		yamaha.color = "Black";
		
		int cost = 15;
		if(cost > 10){
			yamaha.color = "Gold";
		}else {
			yamaha.color = "Black";
		}
		
		PianoClient pc = new PianoClient();

		System.out.println(yamaha.brand);
		
		//===============================
		Piano blackYamaha = new Piano("Yamaha","Black");
		System.out.println(blackYamaha.brand);
		
		
		Piano personalPiano = new Piano("Yamaha","Gold", "MyPiano",3);
		personalPiano.printDetails();
		
		System.out.println("I stay in USA Capital : "+ApplicationConstants.USA_CAPITAL);
		
	}
}
