package OOPS.Project;

class Payroll {

    // Static method
    static void generateSalary(Employee emp) {

        double tax = emp.salary * 0.10;
        double deduction = emp.salary * 0.05;
        double netPay = emp.salary - tax - deduction;

        System.out.println("Salary Details --->");
        System.out.println("Salary " + emp.salary);
        System.out.println("Tax " + tax);
        System.out.println("Deduction " + deduction);
        System.out.println("Net Pay " + netPay);
    }
}
