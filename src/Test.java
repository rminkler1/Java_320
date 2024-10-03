import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Create a new set_of_strings
        Set<String> set_of_strings = new HashSet<String>();

        // Populate the set
        set_of_strings.add("Bellevue");
        set_of_strings.add("University");
        set_of_strings.add("Students");
        set_of_strings.add("Unite");
        set_of_strings.add("Students");  // Duplicate element will not be added
        
        // Print the set
        System.out.println("The Set looks like this: " + set_of_strings);

        // Remove Unite
        set_of_strings.remove("Unite");

        // Print after removing Unite
        System.out.println("The set after removing Unite: " + set_of_strings);
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }


}
