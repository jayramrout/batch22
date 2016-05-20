package jrout.tutorial.exception;

/**
 * Created by Jayram on 5/19/2016.
 */
public class HeightException extends Exception{

    private final String message;

    public HeightException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "There is no such height "+ message;
    }
}
