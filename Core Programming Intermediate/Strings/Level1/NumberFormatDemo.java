import java.util.*;
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        try {
            generateException(s);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        handleException(s);
    }

    public static void generateException(String s){
        int num=Integer.parseInt(s);
        System.out.println(num);
    }

    public static void handleException(String s){
        try{
            int num=Integer.parseInt(s);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
