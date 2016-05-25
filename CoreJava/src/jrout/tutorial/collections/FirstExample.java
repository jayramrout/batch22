package jrout.tutorial.collections;

import jrout.tutorial.inheritance.Manager;
import jrout.tutorial.inheritance.Person;

import java.util.*;

/**
 * Created by Jayram on 5/24/2016.
 */
public class FirstExample {
    public static void main(String[] args) {
        setExample();

    }
    /*
            set names = new hashset();
            for(stringarray){
              names.add(name);
            }
     */

    /**
     * [banana, guave, apple, strawberry]
     */
    public static void setExample() {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");
        System.out.println(fruits);
    }

    /**
     * [apple, banana, strawberry, guave, banana]
     */
    public static void listExample(){
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
