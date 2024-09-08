/*
Robert Minkler
September 7, 2024
CSD 320 Module 6 Assignment Nested For Loops

Write a program that uses nested for loops to output the following with the shown display format:
7 Rows:
                    1                   @
                 1  2  1                @
              1  2  4  2  1             @
           1  2  4  8  4  2  1          @
        1  2  4  8 16  8  4  2  1       @
     1  2  4  8 16 32 16  8  4  2  1    @
  1  2  4  8 16 32 64 32 16  8  4  2  1 @
*/

// Import scanner for user input

import java.util.Scanner;

public class MinklerModule6 {
    public static void main(String[] args) {

        // Declare constants
        final int SPACE_COUNT = 4;   // Space reserved for each number of the pyramid

        // init scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize rows and col
        int rows;
        int col;

        // Get the number of rows for the pyramid from the user.
        do {
            System.out.print("Enter the number of rows to build the pyramid (1-10): ");
            rows = input.nextInt();
        } while (rows > 10 || rows < 1);  // Restrict input from 1 - 10 to avoid pyramids with ints over 999.

        // iterate through each row of the pyramid
        for (int row = 1; row <= rows; row++) {

            // for all rows except the last row, output spaces on the left to build a pyramid
            if (rows - row > 0) {
                System.out.format("%" + ((rows - row) * SPACE_COUNT) + "s", "");
            }

            // Initialize countDown to reduce numbers on the down slope
            // 2 is used to counter the increasing iterator (i) and reduce the count by 1
            int countDown = 2;

            // Iterate through each number to be printed in the current row
            // Each row length is the row number multiplied by two minus one.
            for (col = 0; col < row * 2 - 1; col++) {

                // left side of pyramid and center. growing
                if (col < row) {
                    // the number is 2 to the power of the character's position in the row.
                    // Each number is formatted to take SPACE_COUNT spaces to align all rows.
                    System.out.format("%" + SPACE_COUNT + "d", (int) Math.pow(2, col));
                }
                // right side of pyramid. shrinking
                else {
                    System.out.format("%" + SPACE_COUNT + "d", (int) Math.pow(2, col - countDown));
                    countDown += 2;   // subtract one to go down and subtract another to counter the increasing col
                }
            }

            // for all rows except the last row, output spaces on the right to position the @ symbol
            if (rows - row > 0) {
                System.out.format("%" + ((rows - row) * SPACE_COUNT) + "s", "");
            }

            // Start a new row of the pyramid
            // print @ symbol to show the end of the line as required.
            System.out.print(" @\n");
        }
    }
}
