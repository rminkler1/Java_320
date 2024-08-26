package Text_examples;
import java.util.Scanner;

public class c_to_f_2_1 {
    public static void main(String[] args) {
        // formula (9 / 5) * celsius + 32

        // Initialize scanner
        Scanner input = new Scanner(System.in);

        // get temp input as C
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // calculate fahrenheit from Celsius
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // round off to one decimal place
        fahrenheit = (int) (fahrenheit * 10 + 0.5) / 10.0;

        // output results
        System.out.println("The temperature of " + celsius + "C is " + fahrenheit + "F.");
    }
}
