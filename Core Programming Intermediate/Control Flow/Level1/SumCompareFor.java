import java.util.Scanner;
public class SumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            System.out.println("Formula: " + sumFormula);
            System.out.println("For Loop: " + sumLoop);
        }
    }
}
