import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int people=sc.nextInt();
        int handshakes=(people*(people-1))/2;
        System.out.println("The total handshakes are " + handshakes);

    }
}
