//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
package optional_task1;

import java.util.Scanner;

public class LongestShortestNum_1 {
    public static void main(String[] args) {

        Scanner consoleInp = new Scanner(System.in);
        int inputDataCount = 6;
        int numbers[] = new int[inputDataCount];
        int longestNum = 0;
        for (int i = 0; i < inputDataCount; i++) {
            numbers[i] = consoleInp.nextInt();
        }
        int shortestNum = Math.abs(numbers[0]);

        for (int i = 0; i < inputDataCount; i++) {
            if (Math.abs(numbers[i]) < shortestNum) {
                shortestNum = numbers[i];
            }
        }

        for (int i = 0; i < inputDataCount; i++) {
            if (Math.abs(numbers[i]) > Math.abs(longestNum)) {
                longestNum = numbers[i];
            }
        }

        System.out.println("shortest number is  " + shortestNum);
        System.out.println("longest number is  " + longestNum);
    }
}
