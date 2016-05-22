package jrout.tutorial.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Jayram on 5/21/2016.
 */
public class FileExample {
    public static void main(String[] args) throws IOException {
//        writeContentToFile();
        readContent();
    }

    private static void createFile(){
        File dir = new File("C:\\Users\\Jayram\\git\\batch22\\CoreJava\\src\\jrout\\tutorial\\stringexample");
        File file = new File("C:\\Users\\Jayram\\git\\batch22\\CoreJava\\src\\jrout\\tutorial\\stringexample\\JayramExample.java");
//        System.out.println(file.isDirectory());
//        System.out.println(dir.isDirectory());
        System.out.println("File existing "+ file.exists());
        boolean fileCreated = false;
        if(!file.exists()){
            try {
                fileCreated = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("File Created = "+ fileCreated);
    }

    private static void writeContentToFile(){
        FileWriter fw = null;
        File file = new File("C:\\Users\\Jayram\\git\\batch22\\CoreJava\\src\\jrout\\tutorial\\stringexample\\JayramExample.txt");
        try{
            fw = new FileWriter(file, true);
            fw.write("I am going to append this content");
            /// Problem
            fw.flush();
            System.out.println("Content Writen to a file");
//            fw.close();
        }catch (IOException exp){
            exp.printStackTrace();
        }finally {
           if(fw != null) {
               try {
                   fw.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }
    }

    public static void readContent() throws IOException{
        char[] in = new char[100];
        File file = new File("C:\\Users\\Jayram\\git\\batch22\\CoreJava\\src\\jrout\\tutorial\\stringexample\\JayramExample.txt");
        FileReader fr = new FileReader(file);
        int size = fr.read(in);
        System.out.println("Size =" + size);

        for(char c : in){
            System.out.print(c);
        }

    }
}
