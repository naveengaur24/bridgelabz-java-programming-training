import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String s, int start, int end) {
        System.out.println("Generating Exception...");

        String result = s.substring(start, end);
        System.out.println(result); 
    }

    public static void handleException(String s, int start, int end) {
        System.out.println("Handling Exception...");

        try {
            String result = s.substring(start, end);
            System.out.println("Substring: " + result);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }

        System.out.println("Program continues after handling exception");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = sc.nextLine();

        System.out.println("Enter start index:");
        int start = sc.nextInt();

        System.out.println("Enter end index:");
        int end = sc.nextInt();

        try {
            generateException(s, start, end);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        handleException(s, start, end);
    }
}