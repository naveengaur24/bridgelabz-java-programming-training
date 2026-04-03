import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < 100; i++) {
            if (i % num == 0)
                System.out.print(i + " ");
        }
    }
}