

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 9, 8, 888, 4, 9, 3, 1, 99};
        arraySort(numbers);

    }

     public static void arraySort(int[] numbers) {

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            boolean thereAreChanges = false;
            for (int i = 0; i < numbers.length-1; i++) {
                int saveFirstPoint;
                if(numbers[i] > numbers[i+1]) {
                    saveFirstPoint = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = saveFirstPoint;
                    thereAreChanges = true;
                }
            }
            if (thereAreChanges) {
                sorted = false;
            }

        }
        System.out.println(Arrays.toString(numbers));

    }
}

