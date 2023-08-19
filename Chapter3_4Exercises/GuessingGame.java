/*
 This program generate a random number from 1-10 and then
 have the user try to guess that number using
 Name: Patrick Bui
 Date: 6/15/2023
 */

package Chapter3_4Exercises;
import javax.swing.JOptionPane;

public class GuessingGame {
    public static void main(String args[]) {
        int randNum = (int) (Math.random() * 10 + 1);
        System.out.println("The Correct Guess Would Be " + randNum);
        int userAnswer = 0;
        int count = 0;
        while (randNum != userAnswer) {
            count ++;
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 10");
            userAnswer = Integer.parseInt(response);
            String result = null;
            if (userAnswer == randNum) {
                result = "Correct";
            } else {
                if (userAnswer <= 0 || userAnswer > 10) {
                    result = "Invalid guess, please try again!";   
                } else if (userAnswer > randNum) {
                    result = "Too High";
                } else {
                    result = "Too Low";
                }
            }
            JOptionPane.showMessageDialog(null, result + "\nTry Number: " + count);
        }
        if (count == 1) {
            JOptionPane.showMessageDialog(null, "Fabulous!!");
        } else if (count < 3) {
            JOptionPane.showMessageDialog(null, "Great Job!!");
        } else if (count < 5) {
            JOptionPane.showMessageDialog(null, "Nice!!");
        } else {
            JOptionPane.showMessageDialog(null, "You Need More Practice :(((");
        }
    }
}
