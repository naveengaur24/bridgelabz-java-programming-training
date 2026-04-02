public class Discount_Calculation {
    public static void main(String[] args) {
        int fee=125000;
        int dicountpercent=10;
        int discountamount=(fee*dicountpercent)/100;
        int discountedPrice=fee-discountamount;
        System.out.println("The discount amount is INR " + discountamount +" and final discounted fee is INR " + discountedPrice);
    }
}
