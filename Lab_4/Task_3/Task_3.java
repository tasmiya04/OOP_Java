// import java.util.Scanner;
public class Task_3 {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1000, "Account 1");
        BankAccount acc2 = new BankAccount(500, "Account 2");
        // Scanner input = new Scanner(System.in);
        // System.out.println("WEllCOME TO BANK");
        // System.out.println("1. Deposit");
        // System.out.println("2. Withdraw");
        // System.out.println("3. Check Balnce");
        // int choice = input.nextInt();

        acc1.deposit(500);
        acc2.deposit(1500);

        acc1.checkBalance();
        acc2.checkBalance();

        acc1.withdraw(500);
        acc1.checkBalance();

        acc2.withdraw(3000);
    }
}
