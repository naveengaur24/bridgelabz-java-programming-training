import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = num - 1;
        int greatest = 1;

        while (i >= 1) {
            if (num % i == 0) {
                greatest = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest Factor = " + greatest);
    }
}