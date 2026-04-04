import java.util.Scanner;
public class SumUsingRecusrsion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int formulate=n*(n+1)/2;
        System.out.println("Sum using recursion: "+sum(n));

        System.out.println("Sum using formula: "+formulate);

    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }

}
