package jrout.tutorial.collections;

import java.util.*;

/**
 * Created by Jayram on 5/24/2016.
 */
public class LoopCollection {
    public static void main(String[] args) {
//        loopSet();
//        loopList();
//        loopSet();
//        changeToSet();
        removeElements();
    }
    public static void loopSet() {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");
        System.out.println(fruits);
    }
    public static void crossAdd(){
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");

        List<String> allFruits = new ArrayList();
        allFruits.addAll(fruits);
    }

    public static void changeToSet(){
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");
        System.out.println(fruits);
        Set<String> fruitSet = new HashSet<>();
        fruitSet.addAll(fruits);
        System.out.println(fruitSet);
    }
    /**
     * [apple, banana, strawberry, guave, banana]
     */
    public static void loopList(){

        List<String> americanFruit = new ArrayList();
        List<String> indianFruit = new ArrayList();

        List<String> fruits = new ArrayList();
        fruits.addAll(americanFruit);
        fruits.addAll(indianFruit);

        System.out.println();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");

        System.out.println(fruits);
        fruits.add(1,"mango");
        System.out.println(fruits);

        fruits.contains("guave");

        int size = fruits.size();
        for(int i = 0 ; i < fruits.size() ;i++){
            System.out.println(fruits.get(i));
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("*****************");
        Iterator iter = fruits.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() +" ");
        }
    }

    public static void removeElements(){
        List<String> fruits = getFruits();
        System.out.println(fruits);
        if(fruits != null) {
            /*for(int i= 0 ; i< fruits.size(); i++){
                if("strawberry".equals(fruits.get(i)))
                    fruits.remove(i);
            }*/
            Iterator iter = fruits.iterator();
            while(iter.hasNext()){
                String fruit = (String)iter.next();
                if("strawberry".equals(fruit)) {
                    iter.remove();
                }
            }
        }
        System.out.println("Final Output is :");
        System.out.println(fruits);
    }





    public static List<String> getFruits(){
        List<String> fruits = new ArrayList();
        System.out.println();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");
        return fruits;
    }
}
