//4.     Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
package optional_task2;

import java.util.Scanner;

public class ArraysMaxPointTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type n:   ");
        int n = scanner.nextInt();
        int[][] numbers = new int[n][n];
        int m = 90;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int flag = (int) (Math.random() * 2 + 1);
                if (flag == 1) {
                    numbers[i][j] = (int) (Math.random() * m + 9);
                } else {
                    numbers[i][j] = (int) (Math.random() * -m - 9);
                }
            }
        }
        SortMultidimensionalArraysTask1.printDigits(numbers);
        System.out.println();
        int maxElement = numbers[0][0];
        int maxElementFirstIndex = 0;
        int maxElementSecondIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] > maxElement) {
                    maxElement = numbers[i][j];
                    maxElementFirstIndex = i;
                    maxElementSecondIndex = j;
                }

            }

        }
        System.out.println("Max Element is " + maxElement + "  numbers(" + maxElementFirstIndex + "/" +
                maxElementSecondIndex + ")");

        for (int i = 0; i < n; i++) {
            if (i == maxElementFirstIndex ){
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (j == maxElementSecondIndex) {
                    continue;
                }else {
                    System.out.print(numbers[i][j] + "   ");
                }
            }
            System.out.println();
        }

    }



}
