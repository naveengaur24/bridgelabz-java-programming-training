package Review;
import java.util.*;
public class GymMembership {
    // Calculate Fee
    public static int calculateFee(int months, String type, String plan, int totalMembers) {
        int monthlyCost = 0;
        int total = 0;

        // Individual Plan ke liye
        if (plan.equalsIgnoreCase("Individual")) {
            if (type.equalsIgnoreCase("Basic")) {
                monthlyCost = 800;
            }
            else {
                monthlyCost = 1500;
            }
            total = monthlyCost * months;
        }
        // Corporate Plan ke liye 5 or 5 se jyda
        else if (plan.equalsIgnoreCase("Corporate") && totalMembers >=5) {
            if (type.equalsIgnoreCase("Basic")) {
                monthlyCost = 600;
            }
            else {
                monthlyCost = 1200;
            }
            total = monthlyCost * months;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of members");
        int n = sc.nextInt();
        int[] months = new int[n];
        String[] type = new String[n];
        String[] plan = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Member " + (i+1));

            System.out.print("Months");
            months[i] = sc.nextInt();

            System.out.print("Membership Type basic hai ya pro ");
            type[i] = sc.next();

            System.out.print("Plan Type individual hai ya corporate ");
            plan[i] = sc.next();
        }
        int totalRevenue = 0;
        for (int i = 0; i < n; i++) {
            int fee = calculateFee(months[i], type[i], plan[i], n);
            totalRevenue += fee;
        }
        int totalMembers = n;
        int avgFee =  totalRevenue/totalMembers;

        int branchId = 101;
        System.out.println("\nBranch ID: " + branchId);

        System.out.println("\nOutput Summary ");
        System.out.println("Total Members " + totalMembers);
        System.out.println("Total Revenue " + totalRevenue);
        System.out.println("Average Fee " + avgFee);
    }
}
