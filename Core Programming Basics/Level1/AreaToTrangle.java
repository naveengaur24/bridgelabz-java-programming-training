import java.util.Scanner;

public class AreaToTrangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;

        double baseInch = base / 2.54;
        double heightInch = height / 2.54;

        double areaInch = 0.5 * baseInch * heightInch;

        System.out.println("Area in square cm is " + areaCm +" and in square inches is " + areaInch);
    }
}
