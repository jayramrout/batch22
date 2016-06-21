package jrout.tutorial.spring.core;

public class BikeCompanyImpl implements ICompany {

	private String manufactureName;
	
	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public int totalEmployees() {
		return 200;
	}

	public String getManufacture() {
		return "I am a "+manufactureName+" Company";
	}
	
	
}
