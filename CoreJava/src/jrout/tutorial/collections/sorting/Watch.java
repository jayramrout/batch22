package jrout.tutorial.collections.sorting;

/**
 * Created by Jayram on 5/25/2016.
 */
public class Watch implements Comparable {
    private String name;
    private String model;
    private String make;

    public Watch(String name, String model, String make) {
        this.name = name;
        this.model = model;
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "["+getName() +" "+ getModel() +" "+ getMake()+"]";
    }

    @Override
    public int compareTo(Object o) {
        Watch watchOne = (Watch)o;
        return this.getName().compareTo(watchOne.getName());
    }
}
