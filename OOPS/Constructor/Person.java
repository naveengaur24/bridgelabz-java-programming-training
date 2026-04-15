package OOPS.Constructor;

public class Person {
    String name;
    int age;


    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    Person(Person old){
        this.name=old.name;
        this.age=old.age;
    }

    public static void main(String[] args) {
        Person p1=new Person("Naveen", 22);
        System.out.println("Name: "+p1.name);
        System.out.println("Age: "+p1.age);

        Person p2=new Person(p1);
        System.out.println("\nName: "+p2.name); 
        System.out.println("Age: "+p2.age);
    }
}
