import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String res=toUpperCase(s);
        System.out.println("Uppercase: " + res);


    }

    public static String toUpperCase(String s){
        String res="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='a' && ch<= 'z'){
                ch=(char) (ch-32);
            }
            res+=ch;
        }
        return res;
    }
}
