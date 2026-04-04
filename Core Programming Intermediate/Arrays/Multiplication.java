import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();

        int[]res=new int[10];

        for(int i=0;i<10;i++){
            res[i]=n*(i+1);
        }
        for(int i=0;i<10;i++){
                        System.out.println(n + " * " + (i+1) + " = " + res[i]); 
        }
    }
}
