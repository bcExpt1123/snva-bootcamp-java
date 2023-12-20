package bakery;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Task 1
 * ----------
 * Bakery shop
 * ----------
 * Bala takes care of accounts
 * at the Bakery shop
 * The shop sells the following pastries:
 * - black current - $.5
 * - white forest - $.3
 * - chocolate - $.4
 * - red velvet - $.45
 * each customer will buy at least one each,
 * take the number of pastries as input
 * calculate the amount for each pastry,
 * find the total,
 * print item wise bill
 */

public class BakeryShop {
    public static void main(String[] args) {
        // Define the prices of pastries
        double blackCurrantPrice = 175;
        double whiteForestPrice = 130;
        double chocolatePrice = 127.5;
        double redVelvetPrice = 241.4;

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the quantity of each pastry from the user
        System.out.print("Enter no of Black Current : ");
        int blackcurrantQty = scanner.nextInt();

        System.out.print("Enter no of White Forest : ");
        int whiteForestQty = scanner.nextInt();

        System.out.print("Enter no of Chocolate : ");
        int chocolateQty = scanner.nextInt();

        System.out.print("Enter no of Red Velvet : ");
        int redVelvetQty = scanner.nextInt();

        // Calculate the amount for each pastry
        double blackcurrantAmount = blackCurrantPrice * blackcurrantQty;
        double whiteForestAmount = whiteForestPrice * whiteForestQty;
        double chocolateAmount = chocolatePrice * chocolateQty;
        double redVelvetAmount = redVelvetPrice * redVelvetQty;

        // Calculate the total amount
        double totalAmount = blackcurrantAmount + whiteForestAmount + chocolateAmount + redVelvetAmount;

        // Print the bill
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("===================================================");
        System.out.println("Menu Item\t\tPrice\t\tQty\t\tPayable");
        System.out.println("===================================================");
        System.out.println(String.format("Black Current\t%s\t\t%d\t\t%s",
                decimalFormat.format(blackCurrantPrice), blackcurrantQty, decimalFormat.format(blackcurrantAmount)));
        System.out.println(String.format("White Forest\t%s\t\t%d\t\t%s",
                decimalFormat.format(whiteForestPrice), whiteForestQty, decimalFormat.format(whiteForestAmount)));
        System.out.println(String.format("Chocholate\t\t%s\t\t%d\t\t%s",
                decimalFormat.format(chocolatePrice), chocolateQty, decimalFormat.format(chocolateAmount)));
        System.out.println(String.format("Red Velvet\t\t%s\t\t%d\t\t%s",
                decimalFormat.format(redVelvetPrice), redVelvetQty, decimalFormat.format(redVelvetAmount)));
        System.out.println("===================================================");
        System.out.println(String.format("Total\t\t\t\t\t\t\t\t%s", decimalFormat.format(totalAmount)));
        System.out.println("===================================================");
    }
}