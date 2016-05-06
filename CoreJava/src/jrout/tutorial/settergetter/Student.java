package jrout.tutorial.settergetter;

//POJO(Plain Old Java Object) , Domain Objects(DO)
public class Student {
	private String sname;
	private int sheight;

	public void setSName(String sname){
		this.sname = sname;
	}
	
	public String getSName(){
		return this.sname;
	}

	public int getSheight() {
		return sheight;
	}

	public void setSheight(int sheight) {
		if(sheight <0){
			this.sheight = 4;
		}else {
			this.sheight = sheight;	
		}
		
	}
}
