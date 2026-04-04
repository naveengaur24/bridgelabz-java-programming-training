import java.util.*;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = new int[10];
        int idx = 0;

        while (n > 0 && idx < 10) {
            digits[idx] = n % 10;
            idx++;
            n /= 10;
        }

        int max = 0, second = 0;

        for (int i = 0; i < idx; i++) {
            if (digits[i] > max) {
                second = max;
                max = digits[i];
            } else if (digits[i] > second && digits[i] != max) {
                second = digits[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + second);
    }
}