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

            if (rows - row > 0) {
                System.out.format("%" + ((rows - row) * 3) + "s", "");
            }

            for (int i = 0; i < row * 2 - 1; i++){
                if (i < row) {
                    System.out.format("%3d", row - i);
                } else {
                    System.out.format("%3d", i - row + 2);
                }
            }
            System.out.print("\n");
        }
    }
}
