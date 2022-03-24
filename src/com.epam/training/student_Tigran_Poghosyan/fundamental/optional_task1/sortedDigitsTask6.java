//Найти число, цифры в котором идут в строгом порядке возрастания.
// Если таких чисел несколько, найти первое из них.
package optional_task1;

public class sortedDigitsTask6 {
    public static void main(String[] args) {
        int[] numberss = new int[]{-35989, 232, 8648, 132, 893999, -90399, 668, -888999, 24635725};
        for (int i = 0; i < numberss.length; i++) {
            if(digitsArehierarchical(numberss[i])){
                System.out.println(numberss[i] + " are hierarchical");
                break;
            }
        }
    }

    static boolean digitsArehierarchical(int number) {
        boolean hierarchicalDigits = true;
        int[] digs = FindNumsWithEvenDigsTask5.returnDigits(number);
        for (int i = 0; i < digs.length - 1; i++) {
            if (digs[i] > digs[i + 1]) {
                return false;
            }
        }
        return hierarchicalDigits;
    }
}
