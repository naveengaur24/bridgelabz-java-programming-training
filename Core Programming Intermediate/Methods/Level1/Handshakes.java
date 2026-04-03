import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countHandshakes(n));
    }
    public static int countHandshakes(int n){
        return (n*(n-1))/2;
    }
}
