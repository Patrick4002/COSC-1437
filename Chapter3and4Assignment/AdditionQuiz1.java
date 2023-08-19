package Chapter3and4Assignment;

import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfEquations;
        double totalEquations = 0;
        double correctAnswers = 0;
        double percentage;
        boolean repeatQuiz;

        do {
            repeatQuiz = false;

            do {
                System.out.print("Enter the number of math equations you would like to solve: ");
                numberOfEquations = scanner.nextInt();
            } while (numberOfEquations < 0);

            for (int i = 0; i < numberOfEquations; i++) {
                int num1 = random.nextInt(50) + 1;
                int num2 = random.nextInt(50) + 1;
                int answer = num1 + num2;

                System.out.print(num1 + " + " + num2 + " = ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == answer) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect!");
                }

                totalEquations++;
            }

            percentage = (correctAnswers / totalEquations) * 100;
            System.out.println("\nNumber of questions answered correctly: " + correctAnswers + " out of " + totalEquations);
            System.out.printf("Percentage: %.2f%%%n", percentage);

            if (percentage < 70) {
                System.out.println("You failed the quiz. Let's try again.\n");
                repeatQuiz = true;
                totalEquations = 0;
                correctAnswers = 0;
            }
        } while (repeatQuiz);

        System.out.println("Congratulations! You passed the quiz.");
    }
}
