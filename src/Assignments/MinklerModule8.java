/*
Robert Minkler
September 23, 2024
CSD 320 Module 8 Assignment

Write four methods that use method overloading.
Write a main method that will test each of these methods two times.
*/


public class MinklerModule8 {

    // Define constant
    static final double stdServiceChg = 30.00;

    public static void main(String[] args) {

        // Just Standard Annual Service - no parameters
        System.out.println("\n\n--Standard Service with no additions--\n");
        printTotal(yearlyService());


        // Standard service and oil change X2
        System.out.println("\n\n--Standard Service and oil change #1--\n");
        printTotal(yearlyService(44.99));

        System.out.println("\n\n--Standard Service and oil change #2--\n");
        printTotal(yearlyService(65.50));


        // Standard service, oil change & Tire Rotation X2
        System.out.println("\n\n--Standard Service, oil change & tire rotation #1--\n");
        printTotal(yearlyService(65.50, 10));

        System.out.println("\n\n--Standard Service, oil change & tire rotation #2--\n");
        printTotal(yearlyService(45.99, 14.99));


        // Standard service, oil change, Tire Rotation, & discount X2
        System.out.println("\n\n--Service, oil change & tire rotation w/ $10 coupon #1--\n");
        printTotal(yearlyService(45.99, 12.99, 10));

        System.out.println("\n\n--Service, oil change & tire rotation w/ $5 coupon #2--\n");
        printTotal(yearlyService(55.99, 10.99, 5.00));
    }

    public static double yearlyService() {
        // No Parameters - Will return the standard service charge.
        // Print pricing breakdown starting with the service charge.
        System.out.printf("%-25s $%,8.2f%n", "Standard Service Charge", stdServiceChg);
        return stdServiceChg;
    }

    public static double yearlyService(double oilChangeChg) {
        // One Parameter - Will return the standard service charge with an added oil change fee.
        // Print pricing breakdown, starting with the service charge then oil change
        yearlyService();
        System.out.printf("%-25s $%,8.2f%n", "Oil Change", oilChangeChg);
        return stdServiceChg + oilChangeChg;
    }

    public static double yearlyService(double oilChangeChg, double tireRotateChg) {
        // Two Parameters - returns standard service charge with an added oil change fee and a tire rotation charge.
        // Print pricing breakdown, starting with all previous items then tire rotation
        yearlyService(oilChangeChg);
        System.out.printf("%-25s $%,8.2f%n", "Tire Rotation", tireRotateChg);
        return stdServiceChg + oilChangeChg + tireRotateChg;
    }

    public static double yearlyService(double oilChangeChg, double tireRotateChg, double dolOffCoupon) {
        // Three Parameters - Returns standard service charge + oil change fee + tire rotation charge - coupon amount
        // Print pricing breakdown, starting with all previous items then discount
        yearlyService(oilChangeChg, tireRotateChg);
        System.out.printf("%-25s($%,8.2f)%n", "Discount Applied", dolOffCoupon);
        return stdServiceChg + oilChangeChg + tireRotateChg - dolOffCoupon;
    }

    public static void printTotal(double total) {
        // Formatted output Line and total
        System.out.println("____________________________________");
        System.out.printf("%-25s $%,8.2f%n", "Total", total);
    }
}