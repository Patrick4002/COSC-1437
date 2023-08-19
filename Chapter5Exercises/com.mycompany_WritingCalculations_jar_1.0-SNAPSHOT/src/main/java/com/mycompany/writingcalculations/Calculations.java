/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.writingcalculations;

/**
 *
 * @author phatbui
 */

public class Calculations {
   public static int generateRandomNum(int a, int b) {
    double range = (Math.abs(a-b)+1);
    if (a<b) {
        return (int) (Math.random() * range + a);
    } else {
        return (int) (Math.random() * range + b);
    }
   }
   
   public static double add(double num1, double num2) {
    return num1 + num2;
   }

   public static double subtract(double num1, double num2) {
    return num1 - num2;
   }

   public static double multiply(double num1, double num2) {
    return num1 * num2;
   }

   public static double divide(double num1, double num2) {
    return num1 / num2;
   }
}

