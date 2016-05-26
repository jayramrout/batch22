package jrout.tutorial.controlStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		switchStatement();
	}

	public static void switchStatement() {

		int ages[] = { 20, 30, 40 };

		for (int age : ages) {
			
			switch (age) {
			case 20: {
				System.out.println("I am still Young");
				break;
			}
			case 30: {
				System.out.println("Wow I have reached 30 !!!");
				break;
			}
			case 40: {
				System.out.println("Oops I have reached 40 ");
				break;
			}
			default:
				System.out.println("You are not yet born.....");
			}
		}
	}
}
