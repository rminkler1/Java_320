public class Test {
    public static void main(String[] args) {
        // Initialize int
        int num1 = 1;
        int num2 = 2;

        // Output values before operations
        System.out.print("Before swap-> ");
        System.out.println("num1: " + num1 + " num2: " + num2);

        // call swap method with both numbers
        swap(num1, num2);

        // Output values after operations
        System.out.print("After swap-> ");
        System.out.println("num1: " + num1 + " num2: " + num2);
    }

    public static void swap(int snum1, int snum2) {

        // Output values before operation
        System.out.print("Inside method swap() before swap-> ");
        System.out.println("num1: " + snum1 + " num2: " + snum2);

        // Swap num1 and num2 using a temporary variable
        int temp;
        temp = snum1;
        snum1 = snum2;
        snum2 = temp;

        // Output values after operation
        System.out.print("Inside method swap() after swap-> ");
        System.out.println("num1: " + snum1 + " num2: " + snum2);
    }
}
