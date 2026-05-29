import java.util.Scanner;

public class ATMInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = scanner.nextDouble();

        System.out.println("\n--- Transaction Details ---");
        System.out.println("Account Holder: " + accountHolder);

        boolean canWithdraw = balance > withdrawal;
        System.out.println("Sufficient funds for withdrawal (Balance > Withdrawal)? " + canWithdraw);

        if (canWithdraw) {
            double remainingBalance = balance - withdrawal;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + remainingBalance);
        } else {
            System.out.println("Transaction failed: Insufficient funds.");
            System.out.println("Remaining Balance: " + balance);
        }

        scanner.close();
    }
}
