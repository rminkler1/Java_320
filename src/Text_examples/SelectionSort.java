package Text_examples;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] listOfInt = {45, 4, 5, 2, 8, 109, 1, 546, 35, 3456, 45, 4, 3, 1};

        System.out.println(Arrays.toString(listOfInt));

        sort(listOfInt);

        System.out.println(Arrays.toString(listOfInt));
    }

    public static void sort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {

            // Find the smallest number
            int minInx = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minInx]) {
                    minInx = j;
                }
            }

            // Swap numbers
            int temp = list[i];
            list[i] = list[minInx];
            list[minInx] = temp;

            System.out.println(Arrays.toString(list));

        }

    }
}
