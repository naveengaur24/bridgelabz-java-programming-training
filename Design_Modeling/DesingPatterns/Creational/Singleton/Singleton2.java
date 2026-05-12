package Design_Modeling.DesingPatterns.Creational.Singleton;

public class Singleton2 {

    private static Singleton2 instance= new Singleton2();   // ye eager initialization hai object starting me hi create ho jata hai, chahe use ki jarurat ho ya na ho. Iska fayda ye hai ki ye thread-safe hota hai..

    private Singleton2(){
        System.out.println("Singleton-2 Constructor Called");
    }
    public static Singleton2 getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        Singleton2 obj1 = Singleton2.getInstance();
        Singleton2 obj2 = Singleton2.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2); // This will print true, as both obj1 and obj2 refer to the same instance
    }
}
