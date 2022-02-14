//Найти количество чисел, содержащих только четные цифры, а среди оставшихся —
// количество чисел с равным числом четных и нечетных цифр.
package optional_task1;

import java.util.Arrays;

public class FindNumsWithEvenDigsTask5 {
    public static void main(String[] args) {
        int[] numberss = new int[]{23, 22233, 8648, 132, 893999, -90399, 23342, -888999, 22233};
        int evenDigitsContain = 0;
        for (int i = 0; i < numberss.length; i++) {
            if (ifNumWithEvenDigs(numberss[i])) {
                evenDigitsContain++;
                System.out.print(numberss[i] + "  ");
            }
        }

        System.out.println(("\n" + "thera are " + evenDigitsContain + " numbers with even digits"));
        int oddEvenequals = 0;
        for (int i = 0; i < numberss.length; i++) {
            if (ifNumWithEvenDigs(numberss[i])) {
                continue;
            } else {
                 if (ifEvenOddEquals(numberss[i])) {
                    System.out.println("in " + numberss[i] + " odd and even are equals");
                    oddEvenequals++;
                }
            }
        }
        System.out.println(("" + "thera are " + oddEvenequals + " numbers with equals odd and even"));

    }

    static boolean ifNumWithEvenDigs(int number) {
        int[] digs = returnDigits(number);
        boolean isEven = true;
        for (int i = 0; i < digs.length; i++) {
            if (digs[i] % 2 != 0) {
                isEven = false;
            }
        }
        return isEven;
    }

    static boolean ifEvenOddEquals(int number) {
        boolean evenOddEquals = true;
        int[] digs = returnDigits(number);
        if (digs.length % 2 == 0) {
            int oddDigNum = 0;
            for (int i = 0; i < digs.length ; i++) {
                if (digs[i] % 2 != 0) {
                    oddDigNum ++;
                }
            }
            if (digs.length / oddDigNum == 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static int[] returnDigits(int number) {
        boolean evenOddEquals = true;
        int count = 0;
        int num2 = number;
        while (num2 / 10 != 0) {
            num2 = num2 / 10;
            count++;
        }
        int[] digs = new int[count + 1];
        for (int i = 0; i < count + 1; i++) {
            digs[count- i] = Math.abs(number % 10);
            number = number / 10;
        }
        return digs;
    }
}
