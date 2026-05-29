import java.util.Scanner;

public class TravelExpenseEstimator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter travel distance (in KM): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter petrol price per liter: ");
        double petrolPrice = scanner.nextDouble();

        System.out.print("Enter vehicle mileage (KM per liter): ");
        double mileage = scanner.nextDouble();

        double petrolNeeded = distance / mileage;
        double totalCost = petrolNeeded * petrolPrice;

        System.out.println("\n--- Travel Expense Estimation ---");
        System.out.println("Petrol needed: " + petrolNeeded + " liters");
        System.out.println("Total travel cost: " + totalCost);

        scanner.close();
    }
}
