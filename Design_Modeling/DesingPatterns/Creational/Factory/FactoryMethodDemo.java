package Design_Modeling.DesingPatterns.Creational.Factory;


//   FACTORY METHOD -->   Factory method vo method hota hai jo ek interface ya abstract class ke through object creation ko control karta hai. Is pattern me, hum ek factory class banate hain jo ek method provide karti hai jisse hum apne client code se object create kar sakte hain. Factory method pattern ka main purpose ye hota hai ki hum apne client code ko factory method ke through object creation se decouple kar sakein, jisse hum apne code ko maintainable aur scalable bana sakte hain. Is pattern me, hum apne client code ko factory method ke through object creation se decouple karte hain, jisse hum future me naye products add kar sakte hain bina client code me changes kiye.





// Step 1: Product Interface
interface Mobile {
    void createMobile();
}

// Step 2: Concrete Classes
class IPhone implements Mobile {
    @Override
    public void createMobile() {
        System.out.println("Creating iPhone Mobile Phone");
    }
}

class OnePlusPhone implements Mobile {
    @Override
    public void createMobile() {
        System.out.println("Creating OnePlus Mobile Phone");
    }
}

class RealMe implements Mobile {
    @Override
    public void createMobile() {
        System.out.println("Creating RealMe Mobile Phone");
    }
}

// Step 3: Factory Class
class MobileFactory {

    public static Mobile createMobile(String companyName) {

        if (companyName == null || companyName.isEmpty()) {
            return null;
        }

        if (companyName.equalsIgnoreCase("IPHONE")) {
            return new IPhone();
        } 
        else if (companyName.equalsIgnoreCase("ONEPLUS")) {
            return new OnePlusPhone();
        } 
        else if (companyName.equalsIgnoreCase("REALME")) {
            return new RealMe();
        } 
        else {
            return null;
        }
    }
}

// Step 4: Client --  Main Class
public class FactoryMethodDemo {

    public static void main(String[] args) {

        // MobileFactory factory = new MobileFactory();

        Mobile m1 = MobileFactory.createMobile("IPHONE");   //  is method se hum apne client code ko factory method ke through mobile create kar rahe hain, jisse hum apne client code ko factory method se decouple kar sakte hain. Is tarah se, agar hume future me naye mobile companies add karni ho, toh hume sirf MobileFactory class me changes karne honge, aur client code me koi changes nahi karne honge. Isse hum apne code ko maintainable aur scalable bana sakte hain.
        m1.createMobile();

        Mobile m2 = MobileFactory.createMobile("ONEPLUS");
        m2.createMobile();

        Mobile m3 = MobileFactory.createMobile("REALME");
        m3.createMobile();
    }
}
