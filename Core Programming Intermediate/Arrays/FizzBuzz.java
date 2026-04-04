import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check positive integer
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }

        // Create array (0 to n)
        String[] arr = new String[n + 1];

        // Fill array
        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                arr[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0 && i != 0) {
                arr[i] = "Fizz";
            } 
            else if (i % 5 == 0 && i != 0) {
                arr[i] = "Buzz";
            } 
            else {
                arr[i] = String.valueOf(i);
            }
        }

        // Print result
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + arr[i]);
        }
    }
}