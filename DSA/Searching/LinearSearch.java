package DSA.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        int result=linearSearch(arr,key);

        if(result==-1){
            System.out.println("Element not found in the array");
        }
    }

    public static int linearSearch(int[]arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index: "+i);
                return i;
            }
        }
        return -1;
    }
}
