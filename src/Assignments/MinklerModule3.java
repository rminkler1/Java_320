/*
Robert Minkler
August 24, 2024
CSD 320 Module 3 Assignment Rock-Paper-Scissors

Write a program that is similar to the popular game titled "Rock-Paper-Scissors."
*/

// Import Scanner class for user input
import java.util.Scanner;

public class MinklerModule3 {

    /*
    Use a method to convert the number to a string.
    I didn't want to repeat this over and over and over again.
    A list would probably be simpler, but I'm looking at ch 6, so I can implement it with if else logic.
    */
    public static String numberToName(int numericalSelection) {

        // initialize name to set and return later
        String name;

        // set name based on the number entered
        if (numericalSelection == 1) {
            name = "Rock";
        }
        else if (numericalSelection == 2) {
            name = "Paper";
        }
        else {
            name = "Scissors";
        }
        return name;
    }

    // use the number selected by the winner to generate the verb for the output message
    public static String numberToVerb(int numericalSelection) {

        // initialize verb to set and return later
        String verb;

        // set the verb based on the number entered
        if (numericalSelection == 1) {
            verb = "SMASHES";   // rock smashes
        }
        else if (numericalSelection == 2) {
            verb = "SMOTHERS";  // paper smothers
        }
        else {
            verb = "CUT";       // scissors cut
        }
        return verb;
    }

    public static void main(String[] args) {

        // Declare constants
        final int MAX_SELECTION = 3;
        final int MIN_SELECTION = 1;
        final String ASCII_ART = "\n" +
                "__________               __                           \n" +
                "\\______   \\ ____   ____ |  | __                       \n" +
                " |       _//  _ \\_/ ___\\|  |/ /                       \n" +
                " |    |   (  <_> )  \\___|    <                        \n" +
                " |____|_  /\\____/ \\___  >__|_ \\                       \n" +
                "        \\/            \\/     \\/                       \n" +
                "__________                                            \n" +
                "\\______   \\_____  ______   ___________                \n" +
                " |     ___/\\__  \\ \\____ \\_/ __ \\_  __ \\               \n" +
                " |    |     / __ \\|  |_> >  ___/|  | \\/               \n" +
                " |____|    (____  /   __/ \\___  >__|                  \n" +
                "                \\/|__|        \\/                      \n" +
                "  _________      .__                                  \n" +
                " /   _____/ ____ |__| ______ _________________  ______\n" +
                " \\_____  \\_/ ___\\|  |/  ___//  ___/  _ \\_  __ \\/  ___/\n" +
                " /        \\  \\___|  |\\___ \\ \\___ (  <_> )  | \\/\\___ \\ \n" +
                "/_______  /\\___  >__/____  >____  >____/|__|  /____  >\n" +
                "        \\/     \\/        \\/     \\/                 \\/ \n";
        // ASCII art generated at https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Rock%0APaper%0AScissors

        final String WINNER_ASCII = "\n" +
                " __      __.__                           ._.\n" +
                "/  \\    /  \\__| ____   ____   ___________| |\n" +
                "\\   \\/\\/   /  |/    \\ /    \\_/ __ \\_  __ \\ |\n" +
                " \\        /|  |   |  \\   |  \\  ___/|  | \\/\\|\n" +
                "  \\__/\\  / |__|___|  /___|  /\\___  >__|   __\n" +
                "       \\/          \\/     \\/     \\/       \\/\n";
        // ASCII art generated at https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Winner!

        // Create a new scanner obj to collect user input
        Scanner input = new Scanner(System.in);

        // Generate random number for the computer's selection: 1, 2, or 3
        int computerSelection = (int) (MIN_SELECTION + Math.random() * MAX_SELECTION);

        // Display Ascii Art Intro
        System.out.println(ASCII_ART);

        // Get user's selection of 1 Rock, 2 Paper, or 3 Scissors
        System.out.print("Enter your selection" +
                         "\n1 Rock" +
                         "\n2 Paper" +
                         "\n3 Scissors" +
                         "\nChoose Wisely... ");
        int userSelection = input.nextInt();

        // catch entries other than 1, 2, or 3. Make them valid and random
        if (userSelection < MIN_SELECTION || userSelection > MAX_SELECTION) {

            // Choose a random selection for the user since they failed to choose a valid option.
            userSelection = (int) (MIN_SELECTION + Math.random() * MAX_SELECTION);

            // Error message
            System.out.println("\nYour selection was not 1, 2, or 3. I said choose WISELY." +
                    "\nI should kick you out of the game, but I’ll be nice today. " +
                    "\nYou are " + userSelection + " " + numberToName(userSelection) + ".");
        }

        // Output user and computer selections
        System.out.println();   // blank line
        System.out.println("You selected " + userSelection + " " + numberToName(userSelection) + ".");
        System.out.println("The computer selected " + computerSelection + " " + numberToName(computerSelection) + ".");

        // Compare results and declare a winner
        // Check for tie. Display tie message
        if (computerSelection == userSelection){
            System.out.println("TIE! You both selected " + numberToName(computerSelection) + ".\n");
        }
        // Determine if the user won. This one statement catches all three winning scenarios.
        // User won if they selected one option higher than computer or user selected 1 when computer selected 3
        else if (userSelection == computerSelection + 1 || userSelection == computerSelection - 2) {
            // Display winning message
            System.out.println("You WON! Your " + numberToName(userSelection) + " " + numberToVerb(userSelection) +
                               " the computer's " + numberToName(computerSelection) + "!");

            // Display winner ascii art
            System.out.println(WINNER_ASCII);
        }
        // User lost. Display losing message
        else {
            System.out.println("You LOST! The computer's " + numberToName(computerSelection) + " " +
                               numberToVerb(computerSelection) + " your " + numberToName(userSelection) + "!\n");
        }
    }
}