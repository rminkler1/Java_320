package Text_examples;

import java.util.Scanner;

public class sum_digits_2_6 {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);

        // prompt user for int
        System.out.print("Enter a number between 0 and 1000: ");
        short number = input.nextShort();

        // calculate sum of digits
        byte sum = 0;   // init variable

        sum += (byte) (number % 10);
        number /= 10;
        sum += (byte) (number % 10);
        number /= 10;
        sum += (byte) (number % 10);

        System.out.println("The sum of the digits is " + sum + ".");

    }
}
