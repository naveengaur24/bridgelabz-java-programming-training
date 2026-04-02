import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;        
        double miles = yards / 1760;    

        System.out.println("Your Height in cm is " + yards +" while in feet is " + miles +" and inches is " + miles);
    }
}
