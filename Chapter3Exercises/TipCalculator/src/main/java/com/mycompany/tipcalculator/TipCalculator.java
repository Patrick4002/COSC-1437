/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tipcalculator;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
/**
 * Computing Tip Amount 
 * written by @author phatbui on 6/10/2023.
 */
public class TipCalculator {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the total bill");
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        double bill = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the tip percentage as a decimal" + "(Example: 10% would be 0.1)");
        double percentage = Double.parseDouble(input);
        double tipAmount = bill * percentage;
        JOptionPane.showMessageDialog(null, "Bill amount: " + dollars.format(bill) + "\nTip Percentage: " + percentage + "\nTip: " + dollars.format(tipAmount));
        
    }
}
