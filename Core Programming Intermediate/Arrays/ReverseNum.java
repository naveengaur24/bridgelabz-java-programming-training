import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] arr = new int[count];
        temp = n;

        for (int i = 0; i < count; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}