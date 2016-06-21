package jrout.tutorial.spring.core;

public class CarCompanyImpl implements ICompany {

	private String manufactureName;
	private CompanyDetails companyDetails;
	
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}
	public int totalEmployees() {
		// TODO Auto-generated method stub
		return 200;
	}

	public String getManufacture() {
		// TODO Auto-generated method stub
		return "Manufactures "+ manufactureName;
	}
	
	@Override
	public String toString(){
		return manufactureName + " Company Details = "+ companyDetails;
	}

}
