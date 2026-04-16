package OOPS.Project;

class Employee {
    // Instance variables
    String name;
    String id;
    String password;
    double salary;

    // Static variable
    static String company = "Magic EdTech";

    // Constructor
    Employee(String name, String id, String password, double salary) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.salary = salary;
    }

    // Method to display details
    void display() {
        System.out.println("Company: " + company);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
