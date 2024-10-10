/*
Robert Minkler
October 9, 2024
CSD 320 Module 11 Assignment

Return the largest element's 2D index location as an array.

    public static int[] locateLargest (double[][] arrayParam)
    public static int[] locateLargest (int[][] arrayParam)

Return the smallest element's 2D index location as an array.

    public static int[] locateSmallest (double[][] arrayParam)
    public static int[] locateSmallest (int[][] arrayParam)
*/

import java.util.Arrays;

public class MinklerModule11 {
    public static void main(String[] args) {

        // Define arrays
        double[][] myDoubleArray = {
                {100.1, 10.2, 1.3},
                {2.2, 2.3, 0.10343214, 200.4},
                {300.3, 3.5, 3000.7, 3000.5},
                {547.4, 42.03, 0.91543254, 2.34, 1432.341}
        };
        int[][] myIntArray = {
                {13, 2, 3, 4000, 5, 6},
                {12, 12, 15, 1, 17, 19, 10},
                {23, 643, 8, 234,}
        };

        // Display arrays
        System.out.println("Array 1: " + Arrays.deepToString(myDoubleArray));
        System.out.println("Array 2: " + Arrays.deepToString(myIntArray));
        System.out.println();   // Spacing

        // locate and display largest double
        int[] largestDoubleIndex = locateLargest(myDoubleArray);

        System.out.println("The largest number in the double array is " +
                myDoubleArray[largestDoubleIndex[0]][largestDoubleIndex[1]] +
                " at position " +
                Arrays.toString(largestDoubleIndex)
        );

        // locate and display largest int
        int[] largestIntIndex = locateLargest(myIntArray);

        System.out.println("The largest number in the int array is " +
                myIntArray[largestIntIndex[0]][largestIntIndex[1]] +
                " at position " +
                Arrays.toString(largestIntIndex)
        );

        System.out.println();   // Spacing

        // locate and display smallest double
        int[] smallestDoubleIndex = locateSmallest(myDoubleArray);

        System.out.println("The smallest number in the double array is " +
                myDoubleArray[smallestDoubleIndex[0]][smallestDoubleIndex[1]] +
                " at position " +
                Arrays.toString(smallestDoubleIndex)
        );

        // locate and display smallest int
        int[] smallestIntIndex = locateSmallest(myIntArray);

        System.out.println("The smallest number in the int array is " +
                myIntArray[smallestIntIndex[0]][smallestIntIndex[1]] +
                " at position " +
                Arrays.toString(smallestIntIndex)
        );
    }

    public static int[] locateLargest(double[][] arrayParam) {

        // track the largest value's index location
        int[] largestIndex = {0, 0};

        // traverse the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                // Compare each element in the array to the element tracked by largestIndex.
                // If larger, replace largestIndex with the current index
                if (arrayParam[largestIndex[0]][largestIndex[1]] < arrayParam[i][j]) {
                    largestIndex[0] = i;
                    largestIndex[1] = j;
                }
            }
        }
        // Return the largest index values as an array
        return largestIndex;
    }

    public static int[] locateLargest(int[][] arrayParam) {

        // track the largest value's index location
        int[] largestIndex = {0, 0};

        // traverse the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                // Compare each element in the array to the element tracked by largestIndex.
                // If larger, replace largestIndex with the current index
                if (arrayParam[largestIndex[0]][largestIndex[1]] < arrayParam[i][j]) {

                    // Set largestIndex array values to the current index
                    largestIndex[0] = i;
                    largestIndex[1] = j;
                }
            }
        }
        // Return the largest index values as an array
        return largestIndex;
    }

    public static int[] locateSmallest(double[][] arrayParam) {

        // track the smallest value's index location
        int[] smallestIndex = {0, 0};

        // traverse the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                // Compare each element in the array to the element tracked by smallestIndex.
                // If smaller, replace smallestIndex with the current index
                if (arrayParam[smallestIndex[0]][smallestIndex[1]] > arrayParam[i][j]) {

                    // Set smallestIndex array values to the current index
                    smallestIndex[0] = i;
                    smallestIndex[1] = j;
                }
            }
        }
        // Return the smallest index values as an array
        return smallestIndex;
    }

    public static int[] locateSmallest(int[][] arrayParam) {

        // track the smallest value's index location
        int[] smallestIndex = {0, 0};

        // traverse the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                // Compare each element in the array to the element tracked by smallestIndex.
                // If smaller, replace smallestIndex with the current index
                if (arrayParam[smallestIndex[0]][smallestIndex[1]] > arrayParam[i][j]) {

                    // Set smallestIndex array values to the current index
                    smallestIndex[0] = i;
                    smallestIndex[1] = j;
                }
            }
        }
        // Return the smallest index values as an array
        return smallestIndex;
    }
}
