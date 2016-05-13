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

	public void printDetails(){
		System.out.println("Manager Name =" + super.getName());
		System.out.println("Manager Task is  =" + this.managerTask);
	}

}
