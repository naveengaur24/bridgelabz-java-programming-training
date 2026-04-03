import java.util.Scanner;

public class AthleteRun {
    
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter; 
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double result = calculateRounds(a, b, c);

        System.out.println("Rounds required = " + result);
    }
}