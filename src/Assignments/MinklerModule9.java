/*
Robert Minkler
October 10, 2024
CSD 320 Module 9 Assignment FIX

Write a program that reads and fills an array with 20 integers.
Then, using the array elements, calculate the data to find and display:
    The highest value entered.
    The lowest value entered.
    The average of the numbers entered.
    The sum of the numbers entered.
*/


import java.util.*;

public class MinklerModule9 {

    public static void main(String[] args) {

        // Initialize empty array with 20 elements
        int[] myArray = new int[20];

        // Initialize scanner to read an array
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 20 integers to build the array or pass a file with 20 integers: ");

        // Read in Ints to fill the array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }


        // Display the generated array
        System.out.println("\n\nThis is the array entered\n" + Arrays.toString(myArray));

        // Display the results of each calculation
        System.out.println("\nThe maximum number found in the array is " + getHighest(myArray));
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

        // Set min as the first value in the passed array
        int min = passedArr[0];

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

        // Get the sum
        long result = getSum(passedArr);

        // calculate and return the average as a double
        return (double) result / passedArr.length;
    }

    public static long getSum(int[] passedArr) {
        // Find the sum of the values in the array

        // Start from zero then add all the elements in the array
        long result = 0;

        // iterate over each number in the array to calculate the sum
        for (int num : passedArr) {
            result += num;
        }

        // return the result
        return result;
    }
}
