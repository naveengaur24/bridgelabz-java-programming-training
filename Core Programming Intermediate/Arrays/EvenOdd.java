import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size= (n/2)+1;

        if(n<0){
            System.out.println("Error");
        }
        int evenIdx=0, oddIndex=0;

        int[]even=new int[size];
        int[]odd=new int[size];

        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[evenIdx]=i;
                evenIdx++;
            }
            else{
                odd[oddIndex]=i;
                oddIndex++;
            }
        }
         System.out.println("Even numbers:");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

    }
}
