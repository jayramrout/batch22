package jrout.tutorial.constructor;

public class PianoClientThisExample {

	public static void main(String[] args) {
		
		Piano yamaha = new Piano("Yamaha");
		System.out.println(yamaha.brand);
		
		Piano musicPiano = new Piano("musicPiano","","",3);
		musicPiano.printDetails("Jayram");
		
	}
}
