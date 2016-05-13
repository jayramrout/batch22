package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/12/2016.
 */
public class Employee extends Person {

    private int empId;
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
}
