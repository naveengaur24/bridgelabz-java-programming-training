package OOPS.Project;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Employee  object 
        Employee emp = new Employee("Naveen", "101", "1234", 50000);

        // Login system
        System.out.print("Enter the ID of employee--> ");
        String id = sc.nextLine();

        System.out.print("Enter Password --> ");
        String pass = sc.nextLine();

        // Authentication
        if (emp.id.equals(id) && emp.password.equals(pass)) {

            System.out.println("\nLogin Successfull.....");
            emp.display();

            // instanceof usage
            if (emp instanceof Employee) {
                System.out.println("Valid Employee");
            }

            // Generate salary
            Payroll.generateSalary(emp);

        } else {
            System.out.println("Invalid Login.... Try Again");
        }
    }
}



// project
//  ── Employee.java
//  ── PayrollService.java
//  ── MainApp.java