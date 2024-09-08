import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] arrg) {

        // Create list of Strings
        List<String> myList = new ArrayList<>();

        // add items to list
        myList.add("Hello");
        myList.add("World");

        System.out.println(myList);

        List<String> immutableList = List.copyOf(myList);

        // attempt to add items to the immutable list causes an error
        immutableList.add("I'm great!");
    }
}
