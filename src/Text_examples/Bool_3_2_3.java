package Text_examples;
import java.util.Scanner;

public class Bool_3_2_3 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);


        //Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,
        // if day is 0, 1, 2, 3, 4, 5, 6, accordingly.

        System.out.print("Choose a day of the week 1-7: ");
        int dayOfWeek = input.nextInt();
        String day;

        switch (--dayOfWeek) {
            case 0: day = "Sunday"; break;
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            default: day = "Not A Day";
        }

        System.out.println("The day entered is " + day + ".");
    }
}
