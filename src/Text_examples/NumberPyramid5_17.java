package Text_examples;

import java.util.Scanner;

public class NumberPyramid5_17 {
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
                System.out.format("%" + ((rows - row) * 3) + "s", "");
            }

            // iterate through each number to be printed in the current row
            for (int i = 0; i < row * 2 - 1; i++){
                // first half count down
                if (i < row) {
                    System.out.format("%3d", row - i);
                }
                // second half count up
                else {
                    System.out.format("%3d", i - row + 2);
                }
            }
            // new line of pyramid
            System.out.print("\n");
        }
    }
}
