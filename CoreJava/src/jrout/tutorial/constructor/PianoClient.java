package jrout.tutorial.constructor;

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
	}
}
