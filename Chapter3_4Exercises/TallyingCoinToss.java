/*
Tallying Coin Toss
Name: Patrick Bui
Date: 6/15/2023
*/
package Chapter3_4Exercises;
import java.util.Scanner;


public class TallyingCoinToss {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many times would you like to flip the coin?");
        int times = input.nextInt();
        int head = 0;
        int tail = 0;
        for (int i = 0; i < times; i++) {
            double r = Math.random();
            if (r >= 0.5) {
                head++;
                System.out.println("Heads");
            } else {
                tail++;
                System.out.println("Tails");
            }
        }
        System.out.println("Number of heads: " + head + "\nNumber of tails: " + tail);
    } 
}