package Text_examples;

public class BinarySearch {
    public static void main(String[] args) {
        int[] listOfInt = {2, 5, 7, 12, 16, 18, 24, 29, 34, 41, 63, 66, 92, 100};

        int result = binarySearch(listOfInt, 101);

        System.out.println("Result index = " + result);
    }

    public static int binarySearch(int[] list, int key) {
        int start = 0;
        int end = list.length - 1;

        while (start <= end) {
            int midpoint = (start + end) / 2;

            if (list[midpoint] == key) {
                return midpoint;
            } else if (list[midpoint] < key) {
                start = midpoint + 1;
            } else {
                end = midpoint - 1;
            }
        }
        return -start - 1;
    }

}
