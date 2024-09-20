/*
Robert Minkler
September 20, 2024
CSD 320 Module 7 Assignment

Password Validation
1. 8 Characters long
2. Both characters and digits
3. At least one Uppercase Char
4. At least one Lowercase Char
*/

import java.util.Scanner;

public class MinklerModule7 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // initialize variable for use in do / while loop for password validation.
        boolean isValid;

        // Ask user for input until a valid password has been entered.
        do {
            // Output Password Rules
            System.out.println("""
                    Password Requirements:
                      1. Password must be at least 8 Characters long
                      2. Must contain at least one number
                      3. Must contain at least one uppercase character
                      4. Must contain at least one lowercase character
                    """);

            // Prompt for user input
            System.out.print("Enter your new password: ");
            String password = input.next();

            // Validate password and set isValid to true if valid
            isValid = validatePassword(password);

            // Output result message
            if (isValid) {
                System.out.println("\nThe password \"" + password + "\" is valid.\n");
            } else {
                System.out.println("\nThe password \"" + password + "\" is not a valid password.\n");
            }

        } while (!isValid); // continue prompting until valid password is entered
    }

    private static boolean validatePassword(String pass) {

        // Initialize boolean variable for each test.
        boolean containsLower = false;
        boolean containsUpper = false;
        boolean containsDigit = false;
        boolean overEight;

        // get password length
        int passLength = pass.length();

        // is password over eight characters?
        overEight = passLength >= 8;

        // Iterate over each character of the password to check each character
        for (int i = 0; i < passLength; i++) {

            // Get the character at index i
            char character = pass.charAt(i);

            // Check if character is Digit - If already true, keep set to true
            containsDigit = (containsDigit || charBetween(character, '0', '9'));

            // Check if character is Upper - If already true, keep set to true
            containsUpper = (containsUpper || charBetween(character, 'A', 'Z'));

            // Check if character is Lower - If already true, keep set to true
            containsLower = (containsLower || charBetween(character, 'a', 'z'));

        }

        // Output specific error messages on failure
        if (!overEight)
            System.out.println("The password is too short.");
        if (!containsDigit)
            System.out.println("The password must contain a number.");
        if (!containsUpper)
            System.out.println("The password must contain an uppercase character.");
        if (!containsLower)
            System.out.println("The Password must contain a lowercase character.");

        // Returns true if all requirements are met
        return containsDigit && containsLower && containsUpper && overEight;
    }

    // Test if a char is between charStart and charEnd inclusive.
    private static boolean charBetween(char charToTest, char charStart, char charEnd) {
        return charToTest >= charStart && charToTest <= charEnd;
    }
}