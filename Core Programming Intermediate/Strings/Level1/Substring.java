import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();

        String sub1=substring(s, start, end);
        String sub2=s.substring(start, end);

        boolean res=compare(sub1, sub2);

        System.out.println("Custom substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Do both methods give the same result? " + res);

    }

    public static String substring(String s, int start, int end){
        String result="";
        for(int i=start;i<end;i++){
            result+=s.charAt(i);
        }
        return result;
    }


    public static boolean compare(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        return true;
    }


}
