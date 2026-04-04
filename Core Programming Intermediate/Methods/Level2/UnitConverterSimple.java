import java.util.Scanner;

public class UnitConverterSimple {

    // Q4
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    static double metersToFeet(double m) {
        return m * 3.28084;
    }

    static double feetToMeters(double f) {
        return f * 0.3048;
    }

    // Q5
    static double yardsToFeet(double yards) {
        return yards * 3;
    }

    static double feetToYards(double feet) {
        return feet * 0.333333;
    }

    static double metersToInches(double m) {
        return m * 39.3701;
    }

    static double inchesToMeters(double inch) {
        return inch * 0.0254;
    }

    static double inchesToCm(double inch) {
        return inch * 2.54;
    }

    // Q6
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double poundsToKg(double p) {
        return p * 0.453592;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    static double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double km = sc.nextDouble();
        System.out.println("Miles = " + kmToMiles(km));

        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(c));

        double meters = sc.nextDouble();
        System.out.println("Feet = " + metersToFeet(meters));
    }
}

