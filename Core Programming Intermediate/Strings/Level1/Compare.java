import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        boolean result1=compare(s1, s2);
        boolean result2=s1.equals(s2);

        if(result1==result2){
            System.out.println("Both methods give the same result: " + result1);
        } else {
            System.out.println("The methods give different results: compare() returns " + result1 + ", while equals() returns " + result2);
        }
    }

    public static boolean compare(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
