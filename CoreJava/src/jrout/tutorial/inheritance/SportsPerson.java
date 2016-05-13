package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/12/2016.
 */
public class SportsPerson extends Person {

    private String sports;

    public SportsPerson(String name) {
        super(name);
    }

    public SportsPerson(String name, int age) {
        super(name, age);
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }
}
