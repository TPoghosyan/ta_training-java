//Вывести на консоль те числа, длина которых меньше  средней длины по всем числам, а также длину.
package optional_task1;

public class DigitsAverageLength3 {
    public static void main(String[] args) {
        int[][] numberss = new int[][]{{59, 9, 99598, 0, 77999, -999, 55, -8899}, {0, 0, 0, 0, 0, 0, 0, 0}};
        double average = 0;
        for (int i = 0; i < numberss[0].length; i++) {
            numberss[1][i] = IncreaseUsingSortTask2Vers2.digitCount(numberss[0][i]);
            average += numberss[1][i];
        }
        average = average / numberss[0].length;
        IncreaseUsingSortTask2Vers2.printDigits(numberss);
        System.out.println("average " + average);
        for (int i = 0; i < numberss[0].length; i++) {
            if (numberss[1][i] < average) {
                System.out.print(numberss[0][i] + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < numberss[0].length; i++) {
            if (numberss[1][i] < average) {
                System.out.print(numberss[1][i] + "  ");
            }
        }
    }
}
