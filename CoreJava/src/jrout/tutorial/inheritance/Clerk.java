package jrout.tutorial.inheritance;

public class Clerk extends Employee {
	private String clerkTask;

	public Clerk(String name , String clerkTask){
		super(name);
		this.clerkTask = clerkTask;
	}
	
	public Clerk(String name , int age , String clerkTask){
		super(name, age);
		this.clerkTask = clerkTask;
	}
	
	
	public String getClerkTask() {
		return clerkTask;
	}

	public void setClerkTask(String clerkTask) {
		this.clerkTask = clerkTask;
	}

	public void printDetails() {
		System.out.println("Clerk Name =" + super.getName());
		System.out.println("Clerk Task is  =" + this.clerkTask);
	}
}
