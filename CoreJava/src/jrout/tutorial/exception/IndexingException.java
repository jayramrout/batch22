package jrout.tutorial.exception;

/**
 * Created by Jayram on 5/19/2016.
 */
public class IndexingException extends Exception {

    private final String message;

    public IndexingException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "Please Use proper Index "+ message;
    }
}
