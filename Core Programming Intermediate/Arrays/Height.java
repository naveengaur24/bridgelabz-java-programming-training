import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the heights of 11 people:");
        int[]arr=new int[11];
        for(int i=0;i<11;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<11;i++){
            sum+=arr[i];
        }
        int mean=sum/11;
        System.out.println("Mean height: "+mean);
    }
}
