import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]res=new int[10];

        for(int i=5;i<9;i++){
            res[i]=n*(i+1);
        }

        for(int i=5;i<9;i++){
            System.out.println(n + " * " + (i+1) + " = " + res[i]);
        }
    }
}
