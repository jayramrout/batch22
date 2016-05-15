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

	@Override
	public void behavior() {
		System.out.println("Being cleak i shud behave very polite");
	}

	public void schedule(){
		System.out.println("Clerk Schedule is to come by 8am and go back by 4 pm");
	}
}
