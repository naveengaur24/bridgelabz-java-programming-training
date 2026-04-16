package DSA.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array in sorted order");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        int result=binarySearch(arr,key);
        System.out.println(result);
    }

    public static int binarySearch(int[]arr, int key){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==key){
                System.out.println("Elements found at index -->"+mid);
                return mid;
            }
            if(arr[mid]<key){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println("Element not found in the array");
        return -1;
    }
}
