import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        //  count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        //  store digits
        int[] digits = new int[count];
        temp = n;
        int index = 0;

        while (temp > 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        //  frequency array
        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        //  print frequency
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " = " + freq[i]);
            }
        }
    }
}