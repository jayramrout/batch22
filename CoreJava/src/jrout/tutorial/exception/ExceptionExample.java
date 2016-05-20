package jrout.tutorial.exception;

/**
 * Created by Jayram on 5/19/2016.
 */
public class ExceptionExample {
//    int ages[] = new int[5];
    static int ages[] = {2,3,4,16,6};

    public static void main(String[] args) {
        int index = 8;
        System.out.println("I am evaluating Driving age...");

        int age = 0;
        try{
           age = getMeAgeOnIndex(index);

            /*try{
                int suitableHeight = getSuitableHeight(age);
            }catch(Exception exp){

            }*/

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
    }

    public static int getMeAgeOnIndex(int index){
        return ages[index];
    }

    static int heights[] = {0,0,1,4,7,8};
    public static int getSuitableHeight(int height){
        return heights[height];
    }
}
