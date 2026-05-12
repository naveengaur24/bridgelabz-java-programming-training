package Design_Modeling.DesingPatterns.Creational.Singleton;

//   its a lazy initialization, because the instance is created only when it is needed for the first time. This can help to save resources if the instance is not used at all during the execution of the program. However, this implementation is not thread-safe, meaning that if multiple threads access the getInstance() method simultaneously, it could lead to multiple instances being created. To make it thread-safe, you can use synchronization or other techniques to ensure that only one thread can create the instance at a time.

public class Singleton {

    public static Singleton obj;

    private Singleton(){
        System.out.println("Singleton Constructor Called");
    }


    // ye thread safety provide nahi karta hai, multiple threads ke liye problem create kar sakta hai kyuki agar do ya zyada threads ek sath getInstance() method ko call karte hain, toh dono threads instance variable ko null check karenge aur dono threads new Singleton() create karenge, jisse multiple instances create ho jayenge. Is problem ko solve karne ke liye, hum synchronized keyword ka use kar sakte hain ya double-checked locking technique ka use kar sakte hain, jisse ensure hota hai ki sirf ek thread hi instance create karega.

    // public static Singleton getInstance(){     
    //     if(obj == null){
    //         obj = new Singleton();
    //     }
    //     return obj;
    // }



    // synchronized block ka use karke thread safety provide kar sakte hain, jisse ensure hota hai ki sirf ek thread hi instance create karega. Is implementation mein, pehle null check kiya jata hai, aur agar instance null hai, toh synchronized block ke andar dobara null check kiya jata hai. Agar instance abhi bhi null hai, toh hi new Singleton() create kiya jata hai. Is tarah se, multiple threads ke liye bhi sirf ek instance create hoga.
    public static Singleton getInstance(){     
        if(obj == null){
            synchronized(Singleton.class) {
                if(obj == null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }


    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2); // This will print true, as both obj1 and obj2 refer to the same instance
    }
}
