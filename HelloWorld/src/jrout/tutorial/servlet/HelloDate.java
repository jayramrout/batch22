package jrout.tutorial.servlet;

public class HelloDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5 ; i++) {
			
			System.out.println(new java.util.Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
