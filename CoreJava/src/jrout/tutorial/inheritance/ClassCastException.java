package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/14/2016.
 */
public class ClassCastException {
    public static void main(String[] args) {
        Employee softwareEngineer = new SoftwareEngineer("Jayram");
        Employee clerk = new Clerk("Raju","Supply Materials");

        printPersonSchedule(softwareEngineer);
        printPersonSchedule(clerk);
       /* SportsPerson sp = new SportsPerson("Tendulkar");
        printPersonSchedule(sp);*/
    }

    public static void printPersonSchedule(Person person){
        if(person instanceof SoftwareEngineer){
            SoftwareEngineer swPerson1 = (SoftwareEngineer)person;
            swPerson1.schedule();
        }else if(person instanceof Clerk){
            Clerk swPerson1 = (Clerk)person;
            swPerson1.schedule();
        }
    }
}
