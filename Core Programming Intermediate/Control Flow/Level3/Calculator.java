import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=sc.nextInt();
        System.out.println("Enter second number:");
        int n2=sc.nextInt();
        System.out.println("Enter the operator:");
        String operator=sc.next();

        switch(operator){
            case "+":
                System.out.println("The sum is:"+(n1+n2));
                break;
            case "-":
                System.out.println("The difference is:"+(n1-n2));
                break;
            case "*":
                System.out.println("The product is:"+(n1*n2));
                break;
            case "/":
                if(n2!=0){
                    System.out.println("The quotient is:"+(n1/n2));
                }
                else{
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
