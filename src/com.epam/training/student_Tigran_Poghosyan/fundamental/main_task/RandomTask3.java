//Output a given number of random numbers(1-100) with and without a line break
package main_task;

import java.util.Scanner;

public class RandomTask3 {
    public static void main(String[] args) {

        Scanner systemScanner = new Scanner(System.in);
        System.out.println("type how many random numbers do you want to print  ");
       //  int numberOfDigits = Integer.parseInt(args[0]);
        //
        int numberOfDigits = systemScanner.nextInt();
        int[] randomNumbers = new int[numberOfDigits];
        for (int i = 0; i < numberOfDigits; i++) {
            randomNumbers[i] =  (int) (Math.random() * 100) + 1;
            System.out.print(randomNumbers[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < numberOfDigits; i++) {
            System.out.println(randomNumbers[i] + "  ");
        }

    }
}
