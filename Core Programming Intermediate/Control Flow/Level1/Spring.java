import java.util.Scanner;
public class Spring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String month=sc.nextLine();
        int day=sc.nextInt();
        if(month.equals("March") && day>=20 && day<=31){
            System.out.println("True");
        }
        else if(month.equals("April") && day>=1 && day<=30){
            System.out.println("True");
        }
        else if(month.equals("May") && day>=1 && day<=31){
            System.out.println("True");
        }
        else if(month.equals("June") && day>=1 && day<=20){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
