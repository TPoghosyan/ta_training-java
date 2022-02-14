//  Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из ни
package optional_task1;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersWithDifDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int x = -1;
            while (numbers[i] % 10 != 0) {
                if (numbers[i] % 10 != x){
                    x = numbers[i] % 10;
                    numbers[i] = numbers[i] / 10;
                }
            }

        }
        System.out.println();
    }
}






