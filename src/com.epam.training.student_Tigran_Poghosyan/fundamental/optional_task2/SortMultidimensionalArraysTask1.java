//Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы
// в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
//     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
package optional_task2;

import java.util.Scanner;

public class SortMultidimensionalArraysTask1 {
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
        printDigits(numbers);
        System.out.println();

        boolean sorted = false;
        int k = 1;
        while (!sorted) {
            sorted = true;
            boolean thereAreChanges = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                int[] saveFirstPoint = new int[n];
                if (numbers[i][k] > numbers[i + 1][k]) {
                    saveFirstPoint = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = saveFirstPoint;
//                        saveFirstPoint1 = numberss[1][i];
//                        numberss[1][i] = numberss[1][i + 1];
//                        numberss[1][i + 1] = saveFirstPoint1;
                    thereAreChanges = true;
                }
                if (thereAreChanges) {
                    sorted = false;
                }
            }

        }
        System.out.println("sort by " + k);
        printDigits(numbers);
    }

       static void printDigits(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
