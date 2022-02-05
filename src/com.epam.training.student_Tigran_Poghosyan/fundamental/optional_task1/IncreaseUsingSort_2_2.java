//Вывести числа в порядке возрастания  значений их длины.
package optional_task1;

public class IncreaseUsingSort_2_2 {
    public static void main(String[] args) {


        int[][] numberss = new int[][]{{59, 9, 999998, 0, 77999, -999, 55, -8899}, {0, 0, 0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < 8; i++) {
            numberss[1][i] = digitCount(numberss[0][i]);
        }

        printDigits(numberss);
        System.out.println();
        System.out.println();

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            boolean thereAreChanges = false;
            for (int i = 0; i < numberss[0].length - 1; i++) {
                int saveFirstPoint0;
                int saveFirstPoint1;
                if (numberss[1][i] > numberss[1][i + 1]) {
                    saveFirstPoint0 = numberss[0][i];
                    numberss[0][i] = numberss[0][i + 1];
                    numberss[0][i + 1] = saveFirstPoint0;
                    saveFirstPoint1 = numberss[1][i];
                    numberss[1][i] = numberss[1][i + 1];
                    numberss[1][i + 1] = saveFirstPoint1;
                    thereAreChanges = true;
                }
            }
            if (thereAreChanges) {
                sorted = false;
            }
        }
        printDigits(numberss);
    }

    static int digitCount(int number) {
        int count = 0;
        while (number / 10 != 0) {
            number = number / 10;
            count++;
        }
        return count + 1;
    }

    static void printDigits(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

}



