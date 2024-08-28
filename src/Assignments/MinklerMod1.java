/*
Robert Minkler
August 11, 2024
CSD 320 Module 1 Assignment

Write a program that displays the results of:
4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )
And
4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )
 */

public class MinklerMod1 {
    public static void main(String[] args) {
        // Calculate formula # 1 result
        double formula_1_result = 4.0 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);

        // Calculate formula # 2 result
        int formula_2_result = 4;

        /*
        Java handles division a little differently than Python. In Python, division always outputs a floating-point
        number. On the other hand, Java may output different numeric types depending on what is being divided. If both
        the dividend and divisor are integers, Java will perform integer division and discard the remainder. If either
        number is a floating-point number, the result will be a floating-point number.

        In our formula two example, the division equations are calculated first because of the order of operations.
        1/3, 1/5, 1/7, etc.
        They each calculate to a number less than one. Since the numbers are all integers, each equation calculates to
        zero as the remainder is discarded. The system is calculating 4 * (1 - 0 + 0 - 0 + 0 - 0 + 0) or 4 * 1.

        In our formula one example, the numbers include a decimal place, making them a floating-point number. When
        floating-point numbers are divided in Java, the output is a floating-point number, allowing it to preserve
        fractional amounts.
        1.0 / 3.0 will now calculate to 0.333333333333, which is far more accurate than the 0 we received when
        calculating 1/3.

        In practice, we should always convert numbers into a float or double before division or
        risk inadvertently performing integer division. I can imagine that this could be a major source of logic errors
        if not cautious.
         */

        // Output the results of formula 1
        System.out.println("The result of formula # 1");
        System.out.println("4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )");
        System.out.print("is: ");
        System.out.println(formula_1_result);

        // Display blank line for readability
        System.out.println();

        // Output the results of formula 2
        System.out.println("The result of formula # 2");
        System.out.println("4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )");
        System.out.print("is: ");
        System.out.println(formula_2_result);
    }
}
