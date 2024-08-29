/*
Robert Minkler
August 28, 2024
CSD 320 Module 4 Assignment Strings

Write a program that prompts a user to enter two strings and then checks the strings entered and reports if either
the first string is a substring of the second string, or if the second string is a substring of the first string.
*/


import java.util.Scanner;

public class MinklerModule4 {
    public static void main(String[] args) {

        // Declare Constants
        final String ASCII_INTRO ="""
                
                
                
                
                
                
                                                                                _____
                            ..'''' `````|````` |`````````, | |..          |  .-~     ~.
                         .''            |      |'''|'''''  | |  ``..      | :
                      ..'               |      |    `.     | |      ``..  | :     _____
                ....''                  |      |      `.   | |          ``|  `-._____.'|
                
                                         ____           ______
                `````|````` |         | |             .~      ~.  |`````````, ``..     ..''
                     |      |_________| |______      |          | |'''|'''''      ``.''
                     |      |         | |            |          | |    `.           |
                     |      |         | |___________  `.______.'  |      `.         |
                
                
                
                
                """;
        // ASCII Art generated at http://patorjk.com/software/taag/#p=display&h=2&f=AMC%20Slider&t=String%0ATheory


        // Create Scanner to get user input
        Scanner input = new Scanner(System.in);

        // Display ASCII Art Intro
        System.out.println(ASCII_INTRO);

        // Test to see if a string is a substring of the other
        System.out.println("This will test two strings to see if either is a substring of the other.");

        // Get User Input of Two Strings
        System.out.println("Enter string #1");
        String string_1 = input.nextLine();

        System.out.println("\nEnter string #2");
        String string_2 = input.nextLine();

        // add a blank line to improve readability
        System.out.println();

        // Check if the strings are identical.
        if (string_1.equals(string_2)) {
            System.out.println("Both String #1 and String #2 are identical.");
        }

        // test if String 1 a substring of String 2. Output result
        else if (string_2.contains(string_1)) {
            System.out.println("String #1 is a substring of String #2");
            System.out.println("The string \"" + string_1 + "\" is in \"" + string_2 + "\".\n");
        }

        // test if String 2 a substring of String 1. Output result
        else if (string_1.contains(string_2)) {
            System.out.println("String #2 is a substring of String #1");
            System.out.println("The string \"" + string_2 + "\" is in \"" + string_1 + "\".\n");
        }

        // The strings do not contain substrings
        else {
            System.out.println("There were no substrings found among the two strings you entered.\n");
        }
    }
}
