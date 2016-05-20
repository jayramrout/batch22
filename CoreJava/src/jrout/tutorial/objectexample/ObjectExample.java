package jrout.tutorial.objectexample;

/**
 * Created by Jayram on 5/19/2016.
 */
public class ObjectExample {


    public static void main(String[] args) {
        Mouse apple = new Mouse("Apple","SmartMouse");
        System.out.println(apple);
        System.out.println(apple.getClass());
    }
}
