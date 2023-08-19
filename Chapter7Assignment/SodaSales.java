package Chapter7Assignment;

import java.util.Scanner;

public class SodaSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user how many types of soda they want to sell
        int numSodaTypes;
        do {
            System.out.print("How many types of soda would you like to enter: ");
            numSodaTypes = input.nextInt();
        } while (numSodaTypes < 0);

        // Create arrays to store soda names and sales
        String[] sodaNames = new String[numSodaTypes];
        int[] sodaSales = new int[numSodaTypes];

        // Enter the names of the sodas into the name array
        for (int i = 0; i < numSodaTypes; i++) {
            System.out.print("Enter the name of soda type " + (i + 1) + ": ");
            sodaNames[i] = input.next();
        }

        // Enter the number of bottles sold for each type of soda
        for (int i = 0; i < numSodaTypes; i++) {
            do {
                System.out.print("Enter the number of " + sodaNames[i] + " bottles sold: ");
                sodaSales[i] = input.nextInt();
            } while (sodaSales[i] < 0);
        }

        // Calculate total sales and find highest/lowest selling sodas
        int totalSales = 0;
        int highestSalesIndex = 0;
        int lowestSalesIndex = 0;

        for (int i = 0; i < numSodaTypes; i++) {
            totalSales += sodaSales[i];

            if (sodaSales[i] > sodaSales[highestSalesIndex])
                highestSalesIndex = i;

            if (sodaSales[i] < sodaSales[lowestSalesIndex])
                lowestSalesIndex = i;
        }

        // Display the results
        System.out.println("------------------------------------------");
        System.out.println("Total Sold: " + totalSales);
        System.out.println("Highest Sold: " + sodaNames[highestSalesIndex]);
        System.out.println("Lowest Sold: " + sodaNames[lowestSalesIndex]);

        input.close();
    }
}
