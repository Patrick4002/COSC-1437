/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.writingcalculations;

/**
 *
 * @author phatbui
 */

import java.util.Scanner;

public class WritingCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add, subtract, multiply, or divide?");
        String choice = input.next();
        System.out.println("Pick an integer: ");
        int num1 = input.nextInt();
        System.out.println("Pick another integer: ");
        int num2 = input.nextInt();
        int r1 = Calculations.generateRandomNum(num1, num2);
        int r2 = Calculations.generateRandomNum(num1, num2);
        System.out.println("Random Number 1: " + r1 + "\nRandom Number 2: " + r2);
        switch (choice) {
            case "add":
                System.out.println(r1 + " + " + r2 + " = " + Calculations.add(r1,r2));
                break;
            case "subtract":
                System.out.println(r1 + " - " + r2 + " = " + Calculations.subtract(r1,r2));
                break;
            case "multiply":
                System.out.println(r1 + " * " + r2 + " = " + Calculations.multiply(r1,r2));
                break;
            case "divide":
                System.out.println(r1 + " / " + r2 + " = " + Calculations.divide(r1,r2));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}


