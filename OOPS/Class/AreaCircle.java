package OOPS.Class;

public class AreaCircle {
    int radius;

    public static void main(String[] args) {
        AreaCircle circle1 = new AreaCircle();
        circle1.radius = 5;

        double area = Math.PI * Math.pow(circle1.radius, 2);
        System.out.println("Area of the circle with radius " + circle1.radius + " is: " + area);
    }
}
