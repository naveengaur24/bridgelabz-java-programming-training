import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;

        while(n!=0){
            temp=n%10;
            n=n/10;
            sum+=temp;
        }
        if(temp%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad");
        }
    }
}
