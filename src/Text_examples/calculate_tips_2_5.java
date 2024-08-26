package Text_examples;

import java.util.Scanner;

public class calculate_tips_2_5 {
    public static void main(String[] args) {
        // Init Scanner input
        Scanner input = new Scanner(System.in);

        // Get subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();;

        // calculate gratuity. Round to the nearest penny.
        double gratuity = (int)((subtotal * (gratuityRate / 100.0)) * 100 + 0.5) / 100.0;

        // calculate total due
        double totalDue = (int)((gratuity + subtotal) * 100 + .5) / 100.0;

        // output result
        System.out.println("The gratuity is $" + gratuity + " and the total due is $" + totalDue);

    }
}
