package jrout.tutorial.io.serialization;

import java.io.*;

/**
 * Created by Jayram on 5/24/2016.
 */
public class ReadWriteObject {
    public static void main(String[] args) {
        try {
//            writeObject();
            readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//
    }

    public static void writeObject() throws IOException, NullPointerException {
        Person person = new Person("Ananth","USA", 44444444);
//      System.out.println(person.getAddress());

        FileOutputStream fos = new FileOutputStream("ananth.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();
        System.out.println("Object Written Successfully");
    }

    public static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ananth.dat"));
        Person person = (Person)ois.readObject();
        System.out.println(person.getPersonName());
        System.out.println(person.getAddress());
        System.out.println(person.getSsn());
    }
}
