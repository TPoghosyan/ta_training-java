//Задание. Ввести n чисел с консоли.
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
package optional_task1;

import optional_task1.IncreaseUsingSortTask2Vers2;

import java.util.Scanner;

public class Task1DiferentSolution {
    public static void main(String[] args) {

//        Scanner consoleInp = new Scanner(System.in);
//        int inputDataCount = 6;
        int numbers[] = {555, 66, 9999, -99999, -545552568, 5564654};
        int longestNum = 0;
        int longestNumDigits = 0;
//        for (int i = 0; i < inputDataCount; i++) {
//            numbers[i] = consoleInp.nextInt();
//        }
        int shortestNum = Math.abs(numbers[0]);
        int shortestNumDigits = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) <= shortestNum) {
                shortestNum = numbers[i];
                int count = 1;
                while (shortestNum / 10 != 0) {
                    shortestNum = shortestNum / 10;
                    count++;
                }
                shortestNumDigits = count ;
                shortestNum = numbers[i];
            }

            if (Math.abs(numbers[i]) > Math.abs(longestNum)) {
                longestNum = numbers[i];
                int count = 1;
                while (longestNum / 10 != 0) {
                    longestNum = longestNum / 10;
                    count++;
                }
                longestNumDigits = count ;
                longestNum = numbers[i];
            }
        }
        System.out.println("shortest number is  " + shortestNum + " digits are " + shortestNumDigits);
        System.out.println("longest number is  " + longestNum + "   digits are " + longestNumDigits);
    }
}
