import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        double marks1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double marks2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double marks3 = scanner.nextDouble();

        // Calculating total and average
        double totalMarks = marks1 + marks2 + marks3;
        double averageMarks = totalMarks / 3;

        // Outputting the result
        System.out.println("\n--- Result Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        // Bonus: Comparison operator
        boolean isPassing = averageMarks > 50;
        System.out.println("Is average greater than 50? " + isPassing);

        scanner.close();
    }
}