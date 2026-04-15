package OOPS.Constructor;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();      // default
        Circle c2 = new Circle(5.5);   // parameterized

        c1.display();
        c2.display();
    }
}
