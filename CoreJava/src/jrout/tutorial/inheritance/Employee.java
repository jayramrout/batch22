package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/12/2016.
 */
public abstract class Employee extends Person {

    private int empId;
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public void printDetails() {
        System.out.println("Employe Details = "+ super.getName() );
    }

    @Override
    public void performance() {
        System.out.println("Being a Sports Person I shud give extract performance....");
    }

    public abstract void schedule();
}
