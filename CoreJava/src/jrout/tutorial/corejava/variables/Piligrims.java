package jrout.tutorial.corejava.variables;

public class Piligrims {
	private String name;
	public static int count = 0;
	
	public Piligrims(String name) {
		this.name = name;
		count++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
