public class GenericQuickSort {
    public static void main(String[] args) {
        // Integer quick sort
        Integer[] array = {142, 56, 189, 23, 104, 9, 167, 45, 112, 198, 34, 78, 154, 2, 89, 121, 67} ;
        quickSort(array, 0, array.length - 1);

        for (Integer num : array) {
            System.out.print(num + " ");
        }

        // Employee quick sort (based on years * salary (total comp over tenure))
        Employee2[] array2 = {
                new Employee2(1, 100000),
                new Employee2(9, 100000),
                new Employee2(6, 100000),
                new Employee2(4, 100000),
                new Employee2(2, 100000),
                new Employee2(10, 100000),
                new Employee2(3, 100000),
                new Employee2(5, 100000),
                new Employee2(8, 100000),
                new Employee2(7, 100000),
        };
        quickSort(array2, 0, array2.length - 1);
        for (Employee2 employee : array2) {
            System.out.println(employee);
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int sortedIndex = sort(array, low, high);

            quickSort(array, low, sortedIndex - 1);
            quickSort(array, sortedIndex + 1, high);
        }
    }

    public static <T extends Comparable<T>> int sort(T[] array, int low, int high) {
        T last = array[high];
        int index = low - 1;

        for (int i = low; i < high; i++) {
            if (array[i].compareTo(last) <= 0) {
                T temp = array[++index];
                array[index] = array[i];
                array[i] = temp;
            }
        }

        T temp = array[index + 1];
        array[index + 1] = array[high];
        array[high] = temp;

        return index + 1;
    }
}