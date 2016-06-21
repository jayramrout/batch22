package jrout.tutorial.spring.core;

public class CompanyDetails {
	private int yearCreated;
	private String ceo;
	private String product;
	
	public int getYearCreated() {
		return yearCreated;
	}
	public void setYearCreated(int yearCreated) {
		this.yearCreated = yearCreated;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "yearCreated = "+ yearCreated +" ceo ="+ ceo +" product "+ product;
	}
}
