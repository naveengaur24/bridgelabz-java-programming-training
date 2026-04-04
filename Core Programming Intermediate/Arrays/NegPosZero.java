import java.util.*;
public class NegPosZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println("No. is positive");

                if(arr[i]%2==0){
                    System.out.println("No. is even");
                }
                else{
                    System.out.println("No. is odd");
                }
            }
            else if(arr[i]<0){
                System.out.println("No. is negative");
            }
            else{
                System.out.println("No. is zero");
            }
        }
        if(arr[0]==arr[4]){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}
