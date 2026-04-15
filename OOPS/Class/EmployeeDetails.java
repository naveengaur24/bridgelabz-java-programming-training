package OOPS.Class;

public class EmployeeDetails {
    String name;
    int id;
    double salary;

    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.name = "John Doe";
        emp1.id = 12345;
        emp1.salary = 50000.0;

        System.out.println("Employee Name: " + emp1.name);
        System.out.println("Employee ID: " + emp1.id);
        System.out.println("Employee Salary: " + emp1.salary);
    }
}
