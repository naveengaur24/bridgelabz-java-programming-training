// decorator pattern ek structural design pattern hai jo existing object ke behavior ko dynamically modify karne ke liye use hota hai. Is pattern me, hum ek wrapper class banate hain jo original object ko wrap karta hai aur uske behavior ko enhance karta hai bina original object ke code ko modify kiye. Decorator pattern ka main purpose ye hota hai ki hum apne code ko flexible aur maintainable bana sakein, jisse hum naye features add kar sakte hain bina existing code me changes kiye. Is pattern me, hum apne client code ko decorator ke through object creation se decouple karte hain, jisse hum future me naye decorators add kar sakte hain bina client code me changes kiye.

package Design_Modeling.DesingPatterns.Structural;

// Component Interface
interface Coffee {
    String getCoffee();
}

// ye simple cofee means base class hai jiska behaviour hum change krna chahte hai..
class SimpleCoffee implements Coffee {

    public String getCoffee() {
        return "Simple Coffee";
    }
}

// Decorator Class
class MilkDecorator implements Coffee {

    Coffee coffee;    //original coffee object store karne ke liye reference variable

    MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getCoffee() {
        return coffee.getCoffee() + " + Milk";
    }
}

// Another Decorator
class SugarDecorator implements Coffee {

    Coffee coffee;

    SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getCoffee() {
        return coffee.getCoffee() + " + Sugar";
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Basic Coffee
        Coffee coffee = new SimpleCoffee();

        // Add Milk
        coffee = new MilkDecorator(coffee);

        // Add Sugar
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getCoffee());
    }
}