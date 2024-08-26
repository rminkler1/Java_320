/*
Robert Minkler
August 21, 2024
CSD 320 Programming Assignment 2

Write a program that calculates the energy needed to heat water.
*/


import java.util.Scanner;

public class MinklerModule2 {
    public static void main(String[] args) {
        // Initialize Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Program introduction
        System.out.println("Water Heating Calculator");
        System.out.println("Calculates the amount of energy required to heat water to a desired temperature.\n");

        // Prompt the user for water in kilograms
        System.out.print("Enter the amount of water to heat in Kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt the user for initial water temperature
        System.out.print("Enter the initial water temperature in Celsius: ");
        double initialWaterTemperature = input.nextDouble();

        // Prompt the user for final water temperature
        System.out.print("Enter the final water temperature in Celsius: ");
        double finalWaterTemperature = input.nextDouble();

        // Calculate energy needed to heat the water in joules
        double joulesNeeded = waterMass * (finalWaterTemperature - initialWaterTemperature) * 4184.0;

        // Round joulesNeeded to a whole number
        int roundedJoules = (int) (joulesNeeded + .5);

        // Output the results
        System.out.println("\nHeating " + waterMass + " Kg of water " +
                           "\nfrom " + initialWaterTemperature + " °C to " + finalWaterTemperature + " °C, " +
                           "\nrequires " + roundedJoules + " Joules of energy.");
    }
}
