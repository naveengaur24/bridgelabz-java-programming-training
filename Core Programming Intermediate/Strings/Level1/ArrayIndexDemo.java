import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] arr) {
        System.out.println("Generating Exception...");

        String value = arr[arr.length]; 
        System.out.println("Value: " + value); 
    }

    public static void handleException(String[] arr) {
        System.out.println("Handling Exception...");

        try {
            String value = arr[arr.length]; 
            System.out.println("Value: " + value);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }

        System.out.println("Program continues after handling exception");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        try {
            generateException(arr);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        handleException(arr);
    }
}