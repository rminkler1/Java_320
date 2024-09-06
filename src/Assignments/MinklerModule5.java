/*
Robert Minkler
September 5, 2024
CSD 320 Module 5 Assignment While Loops

Write a program that uses a while loop to display the following math operations both in the smaller to
larger order and then the larger to smaller order with the denominator being 3 through 99.

I was a little confused on what is meant by showing the mathematical results, so I am showing both the
total calculation results and the division results within the larger equation.
*/

public class MinklerModule5 {
    public static void main(String[] args) {

        // Initialize variables to track the denominator and sum
        float denominator; // Float is less precise, but saves screen space and outputs a consistent result.
        double sum;

        // ************* FORWARD RUN 1 ******************

        // Initialize for forward run variables
        denominator = 3.0f; // Start at three
        sum = 0.0d;         // Start empty

        // Add space for readability
        System.out.println();
        System.out.println("Calculate the equation from 1/3 to 1/99.");

        // Run forward from 3 to 99
        while (denominator < 100.0) {

            // Process the equation
            sum = sum + (1 / denominator);

            // Output this portion of the equation.
            System.out.print("1/" + denominator);

            // Print "+" between each fraction. Print "=" at the end of the equation.
            if (denominator < 99.0) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }

            denominator++;
        }
        // Print the sum of the equation.
        System.out.println(sum);


        // ************* FORWARD RUN 2 Division results shown ******************

        // Initialize for forward run variables
        denominator = 3.0f; // Start at three
        sum = 0.0d;         // Start empty

        System.out.println("Simplifies to:");

        // Run forward from 3 to 99
        while (denominator < 100.0) {

            // Process the equation
            sum = sum + (1 / denominator);

            // Output this portion of the equation.
            System.out.print(1 / denominator);

            // Print "+" between each fraction. Print "=" at the end of the equation.
            if (denominator < 99.0) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }

            denominator++;
        }
        // Print the sum of the equation.
        System.out.println(sum);


        // ************* REVERSE RUN 1 ******************

        System.out.println();
        System.out.println("Calculate the equation from 1/99 to 1/3.");

        // Initialize for reverse run variables
        denominator = 99.0f; // Start at 99.0
        sum = 0.0d;         // Start empty

        // Run in reverse from 99 to 3
        while (denominator > 2.0) {

            // Process the equation
            sum = sum + (1 / denominator);

            // Output this portion of the equation.
            System.out.print("1/" + denominator);

            // Print "+" between each fraction. Print "=" at the end of the equation.
            if (denominator > 3.0) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }

            denominator--;
        }
        // Print the sum of the equation.
        System.out.println(sum);

        // ************* REVERSE RUN 2 Division results shown ******************

        System.out.println("Simplifies to:");

        // Initialize for reverse run variables
        denominator = 99.0f; // Start at 99.0
        sum = 0.0d;         // Start empty

        // Run in reverse from 99 to 3
        while (denominator > 2.0) {

            // Process the equation
            sum = sum + (1 / denominator);

            // Output this portion of the equation.
            System.out.print(1 / denominator);

            // Print "+" between each fraction. Print "=" at the end of the equation.
            if (denominator > 3.0) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }

            denominator--;
        }
        // Print the sum of the equation.
        System.out.println(sum);
    }
}
