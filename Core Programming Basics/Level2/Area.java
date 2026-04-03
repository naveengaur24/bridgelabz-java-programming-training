// package Core Programming Basics.Level2;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the base of the triangle:");
        double base=sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height=sc.nextDouble();
        double areaCm=0.5*base*height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInch +" and sq cm is " + areaCm);
    }
}
