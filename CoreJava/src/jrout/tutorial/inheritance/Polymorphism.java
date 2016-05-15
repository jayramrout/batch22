package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/14/2016.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Employee man = new Manager("Vijay","Managing the Project");
        man.schedule();

        Clerk clerk = new Clerk("Raju","Response for Printing");
        clerk.schedule();
    }
}
