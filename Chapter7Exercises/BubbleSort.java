/*
 * 
 * Patrick Bui
 * Jul 9, 2023
 * 
 */

 public class BubbleSort {
    public static void main(String[] args) {

        int number[] = {9, 4, 3, 6, 5};
        boolean swap = true;
        int temp;

        while (swap == true) {
            swap = false;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    temp = number[i + 1];
                    number[i + 1] = number[i];
                    number[i] = temp;
                    swap = true;
                }
            }
        }

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
        }

    }
 }