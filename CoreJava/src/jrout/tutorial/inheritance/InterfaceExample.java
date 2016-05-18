package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/17/2016.
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Swimming sfSwim = new SoftwareEngineer("Jayram");
        Swimming tigerSwim = new Tiger();

        printSwimming(sfSwim);
        printSwimming(tigerSwim);


        Running tigerRun = new Tiger();
        tigerRun.run();

        SoftwareEngineer se = (SoftwareEngineer)sfSwim;
        se.schedule();

        Person swPerson = new SoftwareEngineer("Jayram");
        Person clerk = new Clerk("Raju","Supply Materials");

       /* SoftwareEngineer swPerson1 = (SoftwareEngineer)swPerson;
        swPerson1.schedule();*/

        //((SoftwareEngineer)swPerson).schedule(); -- combining it in one line

    }



    public static void printSwimming(Swimming swim) {
        swim.swimming();
    }

    public static void printRunning(Running running){
        running.run();
    }


}
