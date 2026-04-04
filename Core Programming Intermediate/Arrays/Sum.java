import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[]arr=new double[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }

        while(true){
            System.out.println("Enter the index to find sum or -1 to exit");
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            if(n>=0 && n<arr.length){
                double sum=0;
                for(int i=0;i<=n;i++){
                    sum+=arr[i];
                }
                System.out.println("Sum: "+sum);
            }
            else{
                System.out.println("Invalid index");
            }
        }
    }
}
