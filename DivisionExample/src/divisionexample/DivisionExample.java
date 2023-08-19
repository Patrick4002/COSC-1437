/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisionexample;

/**
 *
 * @author phatbui
 */
import java.util.Scanner;

class DivisionException extends Exception {
    public DivisionException() {
        super("Error: you cannot divide by zero");
    }
}

public class DivisionExample {
    public static double divide(int numerator, int denominator) throws DivisionException {
        if (denominator == 0) {
            throw new DivisionException();
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }
    }
}
