import java.util.Scanner;

public class ATMInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = scanner.nextDouble();

        // Outputting the result
        System.out.println("\n--- Transaction Details ---");
        System.out.println("Account Holder: " + accountHolder);
        
        // Bonus: Using comparison operator to check funds
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