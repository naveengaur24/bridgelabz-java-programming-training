package OOPS.Keywords;

class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    // Constructor
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Naveen", 1, "Developer");
        Employee e2 = new Employee("Rahul", 2, "Tester");

        if (e1 instanceof Employee) {
            e1.display();
        }

        if (e2 instanceof Employee) {
            e2.display();
        }

        System.out.println("Company: " + Employee.companyName);
        Employee.displayTotalEmployees();
    }
}