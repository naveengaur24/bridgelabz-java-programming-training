import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int amount=sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int rate=sc.nextInt();
        System.out.println("Enter the time in years:");
        int time=sc.nextInt();
        interest(amount,rate,time);

    }
    public static void interest(int amount, int rate, int time){
        int si=(amount*rate*time)/100;
        System.out.println("The simple interest is:"+si + " for principal amount:"+amount+" at rate of interest:"+rate+" for time:"+time);
    }
}
