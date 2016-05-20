package jrout.tutorial.exception;

/**
 * Created by Jayram on 5/19/2016.
 */
public class UserDefinedExceptionExample {
    static int ages[] = {2,3,4,16,6};
    public static void main(String[] args) {
        int index = 0;
        System.out.println("I am evaluating Driving age...");

        int age = 0;
        int height = 0;

        try{
            age = getMeAgeOnIndex(index);
            height = getSuitableHeight(age);
//            String message = getTheBMI(age, height);
        }catch(IndexingException ie){
            System.err.println("This is Indexing Exception");
        }catch(HeightException he){
            System.err.println("This is Height Exception");
        }catch(Exception exp){
            exp.printStackTrace();
            age = 15;
        }finally {
            System.out.println("Finally I m here...");
        }

        if(age >= 16){
            System.out.println( age + " Eligible for Driving");
        }else{
            System.out.println("You are not eligible for driving");
        }

        System.out.println("You suitable Height is "+ height);
    }

    static int height[] = {0,0,3,4,5,6,7};
    private static int getSuitableHeight(int age) throws HeightException {
        int hei = 0;
        try {
            hei = height[age];
        }catch(Exception exp){
            throw new HeightException("NO Suitable Height for age "+ age);
        }
        return hei;
    }

    /*public static int getMeAgeOnIndex(int index) throws Exception {
        return ages[index];
    }*/

    public static int getMeAgeOnIndex(int index) throws IndexingException {
        int age =0;
        try{
            age = ages[index];
        }catch(Exception exp){
            throw new IndexingException(" Index Which u have passed is "+ index);
        }
        return age;
    }
}
