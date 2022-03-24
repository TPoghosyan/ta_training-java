//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
package optional_task1;

import java.util.Arrays;

public class FindNumWithDifDigTask7 {
    public static void main(String[] args) {
        int[][] numberss = new int[][]{{5399, 9335, 959888, 15932, 893999, -90399, 555, -880099},
                                       {0, 0, 0, 0, 0, 0, 0, 0},
                                       {0, 0, 0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < 8; i++) {
            numberss[1][i] = IncreaseUsingSortTask2Vers2.digitCount(numberss[0][i]);
            numberss[2][i] = FindNumberWithMinDifferenceDigitsTask4.difDigitCount(numberss[0][i]);
        }
        System.out.println(Arrays.toString(numberss[1]));
        System.out.println(Arrays.toString(numberss[2]));
        for (int i = 0; i < numberss[0].length; i++) {
            if (numberss[1][i] == numberss[2][i]) {
                System.out.println("the number with dif digits is " + numberss[0][i]);
            }

        }
    }

}
