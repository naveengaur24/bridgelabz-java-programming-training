package Design_Modeling.DesingPatterns;

public class Singleton2 {

    private static Singleton2 instance= new Singleton2();   // Eager initialization, the instance is created at the time of class loading. This approach is thread-safe because the instance is created before any thread accesses it. However, it may lead to resource wastage if the instance is not used during the execution of the program, as it is created regardless of whether it is needed or not.

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
