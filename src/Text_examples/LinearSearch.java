package Text_examples;

public class LinearSearch {
    public static void main(String[] args) {
        int[] listOfInt = {1, 4, 5, 2, 8, 109, 546, 35, 3456, 45};

        int result = linearSearch(listOfInt, 3456);

        System.out.println("The index is " + result);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
