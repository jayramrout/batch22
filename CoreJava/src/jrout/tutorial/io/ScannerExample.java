package jrout.tutorial.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Jayram on 5/21/2016.
 */
public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("C:\\Users\\Jayram\\git\\batch22\\CoreJava\\src\\jrout\\tutorial\\stringexample\\StringExample.java");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
