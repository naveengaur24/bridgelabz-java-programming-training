import java.util.Scanner;

public class VoteSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();

            if (age[i] >= 18)
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}