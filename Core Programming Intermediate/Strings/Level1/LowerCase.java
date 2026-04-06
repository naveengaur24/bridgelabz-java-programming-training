import java.util.Scanner;
public class LowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String res=toLowerCase(s);
        System.out.println("Lowercase: " + res);
    }

    public static String toLowerCase(String s){
        String res="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch=(char) (ch+32);
            }
            res+=ch;
        }
        return res;
    }
}
