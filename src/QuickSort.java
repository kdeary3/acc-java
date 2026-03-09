public class QuickSort {
    public static void main(String[] args) {
        int[] array = {142, 56, 189, 23, 104, 9, 167, 45, 112, 198, 34, 78, 154, 2, 89, 121, 67, 13} ;
        quickSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int sortedIndex = sort(array, low, high);

            quickSort(array, low, sortedIndex - 1);
            quickSort(array, sortedIndex + 1, high);
        }
    }

    public static int sort(int[] array, int low, int high) {
        int last = array[high];
        int index = low - 1;

        for (int i = low; i < high; i++) {
            if (array[i] <= last) {
                int temp = array[++index];
                array[index] = array[i];
                array[i] = temp;
            }
        }

        int temp = array[index + 1];
        array[index + 1] = array[high];
        array[high] = temp;

        return index + 1;
    }
}