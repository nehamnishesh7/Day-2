import java.util.Scanner;

public class OnlineShoppingBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Calculating total bill
        double totalBill = price * quantity;

        // Outputting the result
        System.out.println("\n--- Bill Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + totalBill);

        scanner.close();
    }
}