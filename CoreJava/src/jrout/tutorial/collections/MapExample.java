package jrout.tutorial.collections;

import java.util.*;

/**
 * Created by Jayram on 5/24/2016.
 */
public class MapExample {
    public static void main(String[] args) {
        List<String> fruits = returnFruits();
        List<String> gifts = returnGifts();

        Map<String , List<String>> items = new HashMap<>();
        items.put("fruits", fruits);
        items.put("gifts", gifts);
        items.put(null, null);

        System.out.println(items);

        printMapCollection(items);
    }
    // schoolInformation
    /*
    schoolInformationMap   listOfStudents listOfTeacher
     */

    public static void printMapCollection(Map<String , List<String>> map){
           List<String> fruits = map.get("fruits");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
    public static List<String> returnFruits(){
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("guave");
        fruits.add("banana");
        return fruits;
    }

    public static List<String> returnGifts(){
        List<String> gifts = new ArrayList();
        gifts.add("watch");
        gifts.add("phone");
        gifts.add("laptop");
        gifts.add("playstation");
        return gifts;
    }

}
