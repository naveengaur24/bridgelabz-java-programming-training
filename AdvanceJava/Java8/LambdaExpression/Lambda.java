package AdvanceJava.Java8.LambdaExpression;

public class Lambda {
    // public static void print(int a, int b){
    //     System.out.println("Sum: "+(a+b));
    // }

    
    public static void main(String[] args) {
        // Lambda expression assigned to a functional interface
        Calculator calc = (a, b) -> System.out.println("Sum: " + (a + b));
        calc.calculate(10, 20);
    }
    
    // Functional interface
    interface Calculator {
        void calculate(int a, int b);
    }
}
