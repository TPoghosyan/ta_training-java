///Задание. Ввести n чисел с консоли.
//Найти число, в котором количество различных цифр минимально.
// Если таких чисел несколько, найти первое из них.
package optional_task1;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumberWithMinDifferenceDigitsTask4 {
    public static void main(String[] args) {
             // Scanner scanner = new Scanner(System.in);
        int[] numberss = new int[]{5399, 935, 9598, 132, 893999, -90399, 655555, -880099};
        int difDigCount = difDigitCount(numberss[0]);
        int numWithMinDig = 0;
        for (int i = 0; i < numberss.length; i++) {
            if (difDigitCount(numberss[i]) < difDigCount) {
                difDigCount = difDigitCount(numberss[i]);
                numWithMinDig = numberss[i];
            }
        }
        System.out.println( " num with min dif. digits is/  " + numWithMinDig + " / there are " + difDigCount + " digits");

    }

    static int difDigitCount(int number) {
        int count = 0;
        int num2 = number;
        while (num2 / 10 != 0) {
            num2 = num2 / 10;
            count++;
        }
        int[] digs = new int[count + 1];
        for (int i = 0; i < count + 1; i++) {
            digs[i] = number % 10;
            number = number / 10;
        }
        Arrays.sort(digs);
        int difDigitCount = 1;
        for (int i = 0; i < count; i++) {
            if (digs[i] != digs[i + 1]) {
                difDigitCount++;
            }
        }
        return difDigitCount;
    }

}