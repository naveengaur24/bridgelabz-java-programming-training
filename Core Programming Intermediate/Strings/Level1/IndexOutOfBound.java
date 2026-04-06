import java.util.Scanner;
public class IndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        handleException(s);


    }

    public static void generateException(String s){
        char ch=s.charAt(s.length()); // This will throw StringIndexOutOfBoundsException
        System.out.println(ch);
    }

    public static void handleException(String s){
        try{
            char ch=s.charAt(s.length());
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
