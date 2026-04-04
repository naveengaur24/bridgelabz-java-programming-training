import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int idx=0;
        
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int[]arr1=new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[idx]=arr[i][j];
                idx++;
            }
        }
        System.out.println("1D Array:");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
