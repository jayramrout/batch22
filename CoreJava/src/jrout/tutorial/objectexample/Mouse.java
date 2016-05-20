package jrout.tutorial.objectexample;

/**
 * Created by Jayram on 5/19/2016.
 */

public class Mouse extends  Object{
    private final String name;
    private final String brand;

    public Mouse(String brand , String name){
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }

    /*@Override
    public String toString() {
        System.out.println();
        return "Brand Name = "+ this.brand +" Mouse Name ="+ this.name;
    }*/
}
