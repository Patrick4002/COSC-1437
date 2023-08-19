//Doesn't meet some requirements
package Chapter3and4Assignment;

import javax.swing.JOptionPane;
import java.util.Random;

public class AdditionQuiz {
    public static void main(String[] args) {
        String equationCount = JOptionPane.showInputDialog("Please Enter a Valid (larger than 0) Amount of Equations You Want to Solve: " );

        if (Integer.parseInt(equationCount) < 1) {
            equationCount = JOptionPane.showInputDialog("Invalid, Please Enter Other Amount: ");
        } else {
            for (int i = 1; i <= Integer.parseInt(equationCount); i++) {
                equationGenerator(0);
            }
        }
    }

    public static int equationGenerator(int correctAns) {
        Random rand = new Random();
        int firstNum, secondNum, sum;
        firstNum = rand.nextInt(51);
        secondNum = rand.nextInt(51);
        sum = firstNum + secondNum;
        int correctCount = correctAns;

        String inputAnswer = JOptionPane.showInputDialog("Please Enter Your Answer of " + firstNum + " + " + secondNum + ":");
        if (Integer.parseInt(inputAnswer) == sum) {
            correctCount += 1;
            JOptionPane.showMessageDialog(null, "You Correct!!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect!!");
        }
        return correctCount;
    }
}
