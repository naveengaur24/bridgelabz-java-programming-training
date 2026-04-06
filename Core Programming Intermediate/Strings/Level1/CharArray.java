import java.util.Scanner;
public class CharArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // int n=s.length();

        char[]arr1=toCharArray(s);
        char[]arr2=s.toCharArray();

        boolean res=compare(arr1, arr2);

        System.out.println("Are both arrays same? " + res);
    }

    public static char[] toCharArray(String s){
        int n=s.length();
        char[]arr=new char[n];

        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }

        return arr;
    }

    public static boolean compare(char[]arr1, char[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
