import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] arr = {55, 7, 123, 2, 435, 10, 1};

        // compares based on a. Comparison uses Comparable to compare a.
        Employee2[] arr2 = {new Employee2(5, 5), new Employee2(9, 9), new Employee2(8, 8), new Employee2(7, 7)};

        System.out.println("Before Sort: " + Arrays.toString(arr2));
        bubbleSort(arr2);
        System.out.println("After Sort:  " + Arrays.toString(arr2));
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
