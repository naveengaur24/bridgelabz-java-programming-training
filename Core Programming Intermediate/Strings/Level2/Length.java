import java.util.Scanner;
public class Length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();

        System.out.println("Length: " + length(s));
    }

    public static int length(String s){
        int cnt=0;

        for(int i=0;i<s.length();i++){
            cnt++;
        }
        return cnt;
    }
}

