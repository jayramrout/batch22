package jrout.tutorial.inheritance;

public class Manager extends Employee {
	private String managerTask;

	public Manager(String name, String managerTask) {
		super(name);
		this.managerTask = managerTask;
	}

	public String getManagerTask() {
		return managerTask;
	}

	public void setManagerTask(String managerTask) {
		this.managerTask = managerTask;
	}

	@Override
	public void printDetails(){
		System.out.println("Manager Name =" + super.getName());
		System.out.println("Manager Task is  =" + this.managerTask);
	}

	@Override
	public void behavior() {
		System.out.println("Being a Manager i shud behave be bit strict");
	}

	public void schedule(){
		System.out.println("Manager  Scheduel is to come by 10am and go back by 6 pm");
	}
}
