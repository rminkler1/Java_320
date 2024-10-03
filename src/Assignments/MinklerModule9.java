/*
Robert Minkler
October 2, 2024
CSD 320 Module 9 Assignment

Write a program that reads and fills an array with 20 integers.
Then, using the array elements, calculate the data to find and display:
    The highest value entered.
    The lowest value entered.
    The average of the numbers entered.
    The sum of the numbers entered.
*/

import java.util.*;

public class MinklerModule9 {

    // Set maximum array int value. The max value will be one less than this number.
    static final int maxValue = 100;

    public static void main(String[] args) {

        // Initialize empty array with 20 elements
        int[] myArray = new int[20];

        // Fill the array with random ints between 0 and maxValue -1
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * maxValue);
        }

        // Display the generated array
        System.out.println("These numbers were randomly generated " + Arrays.toString(myArray));

        // Display the results of each calculation
        System.out.println("The maximum number found in the array is " + getHighest(myArray));
        System.out.println("The minimum number found in the array is " + getLowest(myArray));
        System.out.println("The average of the numbers in the array is " + getAverage(myArray));
        System.out.println("The sum of all the numbers in the array is " + getSum(myArray));


    }

    public static int getHighest(int[] passedArr) {
        // Find the highest value in the array

        // Track the highest value found with max
        int max = 0;

        // iterate over each number in the array, searching for the max value
        for (int num : passedArr) {
            if (num > max) {
                max = num;      // Save the new max value
            }
        }

        // return the result
        return max;
    }

    public static int getLowest(int[] passedArr) {
        // Find the lowest value in the array

        // Track the lowest value found with min
        int min = maxValue;

        // iterate over each number in the array, searching for the lowest value
        for (int num : passedArr) {
            if (num < min) {
                min = num;      // Save the lowest value to min
            }
        }

        // return the result
        return min;
    }

    public static double getAverage(int[] passedArr) {
        // Find the average value in the array

        // Start from zero then add all the elements in the array
        int result = 0;

        // iterate over each number in the array to calculate the sum
        for (int num : passedArr) {
            result += num;
        }

        // calculate and return the average as a double
        return (double) result / passedArr.length;
    }

    public static double getSum(int[] passedArr) {
        // Find the sum of the values in the array

        // Start from zero then add all the elements in the array
        int result = 0;

        // iterate over each number in the array to calculate the sum
        for (int num : passedArr) {
            result += num;
        }

        // return the result
        return result;
    }
}
