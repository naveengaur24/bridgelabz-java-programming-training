import java.util.Scanner;
public class CounterFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cnt=sc.nextInt();
        for(int i=cnt;i>=1;i--){
            System.out.println(i);
        }
    }
}
