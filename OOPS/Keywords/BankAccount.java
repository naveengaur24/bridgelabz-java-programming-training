package OOPS.Keywords;

public class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;

    static int getTotalAccounts() {
        return totalAccounts; // Example static method
    }

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Alice", 12345);
        BankAccount account2 = new BankAccount("Bob", 67890);

        if (account1 instanceof BankAccount) {
            System.out.println("Account Holder: " + account1.accountHolderName);
            System.out.println("Account Number: " + account1.accountNumber);
        }

        if (account2 instanceof BankAccount) {
            System.out.println("Account Holder: " + account2.accountHolderName);
            System.out.println("Account Number: " + account2.accountNumber);
        }

        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
