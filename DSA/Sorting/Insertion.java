package DSA.Sorting;

import java.util.Scanner;

class Insertion {

    public void insertionSort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Insertion insertion=new Insertion();
        insertion.insertionSort(arr);
        System.out.println("Sorted array:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}