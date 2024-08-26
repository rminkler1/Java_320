package Text_examples;// Reading from the console Example

// import Scanner

import java.util.Scanner;

public class book_2_3 {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        // calculate area
        double area = radius * radius * 3.141592;

        // output result
        System.out.println("The radius entered was " + radius + " and the area is " + area + ".");

    }
}
