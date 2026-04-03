import java.util.*;
public class Guessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=(int)(Math.random()*100) +1;
        System.out.println("Guess the number between 1 to 100");
        int guess=sc.nextInt();

        while(guess!=num){
            if(guess>num){
                System.out.println("Too high! Try again.");
            }
            else{
                System.out.println("Too low! Try again.");
             }
             guess=sc.nextInt();
        }
        System.out.println("Congratulations! You guessed the number.");
    }
}
