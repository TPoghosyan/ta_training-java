//Вывести числа в порядке возрастания (убывания) значений их длины.
package optional_task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IncreaseTask2 {
    public static void main(String[] args) {

        Scanner consoleInp = new Scanner(System.in);
      int inputDataCount = 6;
        int[][] numbers = new int[inputDataCount][2];
//        numbers[0][0] = 555;
//        numbers[1][0] = -55555;
//        numbers[2][0] = 5555555;
//        numbers[3][0] = -55;
//        numbers[4][0] = 2;
//        numbers[5][0] = 5555;

        for (int i = 0; i < inputDataCount; i++) {
            numbers[i][0] = consoleInp.nextInt();
            numbers[i][1] = digitCount(numbers[i][0]);
        }
        System.out.println();
        System.out.println();
        Arrays.sort(numbers,
                new Comparator<int[]>(){
                    public int compare(int[]a,int[]b){
                        return a[1]-b[1];
                    }
                });
        printDigits(numbers);
    }

    static int digitCount(int number) {
        int count = 0;
        while (number / 10 != 0) {
            number = number / 10;
            count++;
        }
        return count+1;
    }

    static void printDigits(int[][] a){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

}
