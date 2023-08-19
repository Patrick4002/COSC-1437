

import java.util.Random;
import java.util.Scanner;

public class MethodsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(10) + 1;
            boolean isTrue = switchPlanet(randomNumber);
            
            System.out.println("True or False?");
            String userAnswer = scanner.nextLine();

            compare(isTrue, userAnswer);

            System.out.println("Play again (yes or no)?");
            String playAgainAnswer = scanner.nextLine();

            playAgain = playAgainAnswer.equalsIgnoreCase("yes");
        }

        System.out.println("Game over.");
    }

    public static boolean switchPlanet(int number) {
        String planetFact;
        boolean isTrue;

        switch (number) {
            case 1:
                planetFact = "Jupiter is the largest planet in the Solar System.";
                isTrue = true;
                break;
            case 2:
                planetFact = "Venus is the hottest planet in the Solar System.";
                isTrue = true;
                break;
            case 3:
                planetFact = "Mercury is the closest planet to the Sun.";
                isTrue = true;
                break;
            case 4:
                planetFact = "Uranus is the coldest planet in the Solar System.";
                isTrue = true;
                break;
            case 5:
                planetFact = "Saturn is the second-largest planet in the Solar System.";
                isTrue = true;
                break;
            case 6:
                planetFact = "Mars has the tallest volcano in the Solar System.";
                isTrue = false;
                break;
            case 7:
                planetFact = "Neptune is the farthest planet from the Sun.";
                isTrue = false;
                break;
            case 8:
                planetFact = "Pluto is considered a planet in the Solar System.";
                isTrue = false;
                break;
            case 9:
                planetFact = "Earth is the only planet known to support life.";
                isTrue = false;
                break;
            case 10:
                planetFact = "Uranus rotates on its side compared to other planets.";
                isTrue = false;
                break;
            default:
                planetFact = "Invalid planet fact.";
                isTrue = false;
        }

        System.out.println(planetFact);
        return isTrue;
    }

    public static void compare(boolean isTrue, String userAnswer) {
        boolean userIsCorrect = userAnswer.equalsIgnoreCase("true");

        if (userIsCorrect == isTrue) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
