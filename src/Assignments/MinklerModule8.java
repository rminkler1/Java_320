/*
Robert Minkler
September 22, 2024
CSD 320 Module 8 Assignment

Write four methods that use method overloading

Write a program with four methods for calculating the cost of a yearly auto service visit. The methods will be titled yearlyService.

        yearlyService(no parameters) - Will return the standard service charge.
        yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
        yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
        yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.

Write a main method that will test each of these methods two times.
*/


import java.text.DecimalFormat;

public class MinklerModule8 {

    // Define constants
    static final double stdServiceChg = 30.00;
    static final DecimalFormat df = new DecimalFormat("0.00");
    static final String line = "___________________________________";

    public static void main(String[] args) {

        double result;

        // Just Standard Annual Service - no parameters
        System.out.println("\n\n--Standard Service with no additions--\n");
        result = yearlyService();
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

        // Just Standard Annual Service - no parameters 2nd time just for assignment compliance.
        System.out.println("\n\n--Standard Service with no additions again--\n");
        result = yearlyService();
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

        // Standard service and $44.99 oil change
        System.out.println("\n\n--Standard Service and oil change #1--\n");
        result = yearlyService(44.99);
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

        // Standard service and $65.50 oil change
        System.out.println("\n\n--Standard Service and oil change #2--\n");
        result = yearlyService(65.50);
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

        // Standard service and $65.50 oil change & $10 Tire Rotation
        System.out.println("\n\n--Standard Service, oil change & tire rotation #1--\n");
        result = yearlyService(65.50, 10);
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

        // Standard service and $45.99 oil change & $14.99 Tire Rotation
        System.out.println("\n\n--Standard Service, oil change & tire rotation #2--\n");
        result = yearlyService(45.99, 14.99);
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

        // Standard service & $45.99 oil change & $12.99 Tire Rotation & $10 off
        System.out.println("\n\n--Service, oil change & tire rotation w/ $10 coupon #1--\n");
        result = yearlyService(45.99, 12.99, 10);
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

        // Standard service & $55.99 oil change & $10.99 Tire Rotation & $5 off
        System.out.println("\n\n--Service, oil change & tire rotation w/ $5 coupon #2--\n");
        result = yearlyService(55.99, 10.99, 5.00);
        System.out.println("Total:\t\t\t\t\t\t$" + df.format(result));

    }

    public static double yearlyService() {
        // No Parameters - Will return the standard service charge.
        // Print pricing breakdown before returning total
        System.out.println("Standard Service Charge\t\t$" + df.format(stdServiceChg));
        System.out.println(line);
        return stdServiceChg;
    }

    public static double yearlyService(double oilChangeChg) {
        // One Parameter - Will return the standard service charge with an added oil change fee.
        // Print pricing breakdown before returning total
        System.out.println("Standard Service Charge\t\t$" + df.format(stdServiceChg));
        System.out.println("Oil Change\t\t\t\t\t$" + df.format(oilChangeChg));
        System.out.println(line);
        return stdServiceChg + oilChangeChg;
    }

    public static double yearlyService(double oilChangeChg, double tireRotateChg) {
        //  Two Parameters - returns standard service charge with an added oil change fee and a tire rotation charge.
        // Print pricing breakdown before returning total
        System.out.println("Standard Service Charge\t\t$" + df.format(stdServiceChg));
        System.out.println("Oil Change\t\t\t\t\t$" + df.format(oilChangeChg));
        System.out.println("Tire Rotation\t\t\t\t$" + df.format(tireRotateChg));
        System.out.println(line);
        return stdServiceChg + oilChangeChg + tireRotateChg;
    }

    public static double yearlyService(double oilChangeChg, double tireRotateChg, double dolOffCoupon) {
        // Three Parameters - Returns standard service charge + oil change fee + tire rotation charge - coupon amount
        // Print pricing breakdown before returning total
        System.out.println("Standard Service Charge\t\t$" + df.format(stdServiceChg));
        System.out.println("Oil Change\t\t\t\t\t$" + df.format(oilChangeChg));
        System.out.println("Tire Rotation\t\t\t\t$" + df.format(tireRotateChg));
        System.out.println("Discount Applied\t\t\t($" + df.format(dolOffCoupon) + ")");
        System.out.println(line);
        return stdServiceChg + oilChangeChg + tireRotateChg - dolOffCoupon;
    }
}
