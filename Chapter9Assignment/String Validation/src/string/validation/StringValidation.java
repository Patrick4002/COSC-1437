/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.validation;

/**
 *
 * @author patrickbui
 */

import java.util.Scanner;

public class StringValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their email address
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        // Validate the email address
        if (isValidEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    private static boolean isValidEmail(String email) {
        // Validate the email address is between 15-25 characters long
        if (email.length() < 15 || email.length() > 25) {
            return false;
        }

        // Validate the email address has an @ symbol
        if (!email.contains("@")) {
            return false;
        }

        // Validate the email address has a number
        boolean hasNumber = false;
        for (char c : email.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }

        return hasNumber;
    }
}
