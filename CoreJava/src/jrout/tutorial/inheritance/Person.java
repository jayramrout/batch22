package jrout.tutorial.inheritance;

public abstract class Person {
	private String name;
	private String address;
	private int height;
	private int age;


	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printDetails(){
		System.out.println("Person Name =" + this.name);
	}


}