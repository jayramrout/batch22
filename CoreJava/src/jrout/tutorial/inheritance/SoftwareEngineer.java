package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/14/2016.
 */
public class SoftwareEngineer extends Employee implements Swimming {
    public SoftwareEngineer(String name) {
        super(name);
    }

    public SoftwareEngineer(String name, int age) {
        super(name, age);
    }

    @Override
    public void behavior() {

    }

    @Override
    public void schedule() {
        System.out.println( getName()+ " My Schedule is to come by 10 AM on week days");
    }

    @Override
    public void swimming() {
        System.out.println("Software Eng.. Swimms OK");
    }
}
