package Text_examples;

import java.util.Scanner;

public class NumberPyramid5_19 {
    public static void main(String[] args) {

        // init scanner object for user input
        Scanner input = new Scanner(System.in);

        // get rows from user
        System.out.print("Enter the number of rows to print: ");
        int rows = input.nextInt();

        // iterate through each row
        for (int row = 1; row <= rows; row++) {

            // if we are not at the last row, add blank spaces to create a pyramid
            if (rows - row > 0) {
                System.out.format("%" + ((rows - row) * 5) + "s", "");
            }

            // initialize j to reduce numbers on the down slope
            int j = 2;

            // iterate through each number to be printed in the current row
            for (int i = 0; i < row * 2 - 1; i++) {

                // up side of pyramid
                if (i < row) {
                    System.out.format("%5d", (int) Math.pow(2, i));
                }
                // down side of pyramid
                else {
                    System.out.format("%5d", (int) Math.pow(2, i - j));
                    j += 2;   // subtract one to go down and subtract another to counter the increasing i
                }
            }

            // new line of pyramid
            System.out.print("\n");
        }
    }
}
