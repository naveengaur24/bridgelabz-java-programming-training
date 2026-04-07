import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toLowerCase();

         vowelConsonants(str);}

    public static void  vowelConsonants(String s){
        int vCnt=0;
        int cCnt=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vCnt++;
                }
                else{
                    cCnt++;
                }
            }
        }
        System.out.println("Vowels: "+vCnt);
        System.out.println("Consonants: "+cCnt);
    }
}
