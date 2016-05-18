package jrout.tutorial.inheritance;

/**
 * Created by Jayram on 5/17/2016.
 */
public class Tiger extends Animal implements Swimming , Running{
    @Override
    public void swimming() {
        System.out.println("Tiger swimms very nicely");
    }

    @Override
    public void run() {
        System.out.println("Tiger runs super fast");
    }
}
