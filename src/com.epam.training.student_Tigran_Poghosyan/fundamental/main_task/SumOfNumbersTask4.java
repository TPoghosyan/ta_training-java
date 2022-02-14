//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
// и вывести результат на консоль.

package main_task;

import java.util.Scanner;

public class SumOfNumbersTask4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDataCount = 3;
        int[] numbers = new int[inputDataCount];
        int summOfInput = 0;
        int productOfNumbers = 1;
        for (int i = 0; i < inputDataCount; i++) {
            numbers[i] = scanner.nextInt();
            productOfNumbers = productOfNumbers * numbers[i];
            summOfInput = summOfInput + numbers[i];

        }
        System.out.println("summ is equals = " + summOfInput);
        System.out.println("multiplication of numbers = " + productOfNumbers);
    }


}



