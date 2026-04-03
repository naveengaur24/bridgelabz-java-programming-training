import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt(), age2 = sc.nextInt(), age3 = sc.nextInt();
        int h1 = sc.nextInt(), h2 = sc.nextInt(), h3 = sc.nextInt();

        // Youngest
        int minAge = Math.min(age1, Math.min(age2, age3));
        // Tallest
        int maxHeight = Math.max(h1, Math.max(h2, h3));

        System.out.println("Youngest age = " + minAge);
        System.out.println("Tallest height = " + maxHeight);
    }
}