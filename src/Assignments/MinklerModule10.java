/*
Robert Minkler
October 3, 2024
CSD 320 Module 10 Assignment

Four overloaded methods that return the average of an array
*/

import java.util.Arrays;

public class MinklerModule10 {

    public static void main(String[] args) {

        // BUILD SHORT ARRAY
        // Initialize empty array with 10 elements
        short[] shortArray = new short[10];

        // Fill the array with random shorts between 0 and 9,999
        for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short) (Math.random() * 10000);
        }

        // Print the shortArray and average
        System.out.println("The array of " + shortArray.length + " short elements is: " + Arrays.toString(shortArray));
        System.out.println("The average of all elements in the array is: " + average(shortArray));
        System.out.println();


        // BUILD INT ARRAY
        // Initialize empty array with 15 elements
        int[] intArray = new int[15];

        // Fill the array with random ints between 0 and 999,999
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 1000000);
        }

        // Print the intArray and average
        System.out.println("The array of " + intArray.length + " int elements is: " + Arrays.toString(intArray));
        System.out.println("The average of all elements in the array is: " + average(intArray));
        System.out.println();


        // BUILD LONG ARRAY
        // Initialize empty array with 8 elements
        long[] longArray = new long[8];

        // Fill the array with random longs between 0 and 4,999,999
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = (long) (Math.random() * 5000000);
        }

        // Print the longArray and average
        System.out.println("The array of " + longArray.length + " long elements is: " + Arrays.toString(longArray));
        System.out.println("The average of all elements in the array is: " + average(longArray));
        System.out.println();


        // BUILD DOUBLE ARRAY
        // Initialize empty array with 6 elements
        double[] doubleArray = new double[6];

        // Fill the array with random doubles between 0 and < 50000
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Math.random() * 50000;
        }

        // Print the doubleArray and average
        System.out.println("The array of " + doubleArray.length + " double elements is: " + Arrays.toString(doubleArray));
        System.out.println("The average of all elements in the array is: " + average(doubleArray));
        System.out.println();
    }

    public static short average(short[] array) {
        // Calculate and return the average as a short
        // set sum to 0 use int to avoid overflow
        int sum = 0;

        // Add each array element to the sum
        for (short i : array) {
            sum += i;
        }

        // Return the average short rounded off to the nearest short
        return (short) ((double) sum / array.length + 0.5);
    }

    public static int average(int[] array) {
        // Calculate and return the average as an int
        // set sum to 0 use long to avoid overflow
        long sum = 0;

        // Add each array element to the sum
        for (int i : array) {
            sum += i;
        }

        // Return the average as an int round to nearest int
        return (int) ((double) sum / array.length + 0.5);
    }

    public static long average(long[] array) {
        // Calculate and return the average as a long

        long sum = 0L;

        // Add each array element to the sum
        for (long i : array) {
            sum += i;
        }

        // Return the average round to nearest long
        return (long) ((double) sum / array.length + 0.5);
    }

    public static double average(double[] array) {
        // Calculate and return the average as a double

        double sum = 0.0;

        // Add each array element to the sum
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
