public class MergeSort {
    public static void main(String[] args) {

        int[] array = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        mergeSort(array, 0, array.length - 1) ;

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) return ;

        int midpoint = low + (high - low) / 2 ;
        mergeSort(array, low, midpoint) ;
        mergeSort(array, midpoint+1, high) ;
        merge(array, low, midpoint, high) ;
    }

    public static void merge(int[] array, int low, int mid, int high) {

        int sizeLeft = mid-low+1 ;
        int sizeRight = high-mid+1 ;
        int combined = sizeLeft + sizeRight ;

        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];
        int[] combinedArray = new int[combined];

        for (int i = 0; i <= sizeLeft; i++) {
            leftArray[i] = array[low+i];
        }

        for (int i = 0; i <= sizeRight; i++) {
            rightArray[i] = array[mid+i+1];
        }

        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while ( (i < leftArray.length) && (j < rightArray.length) ) {
            if (leftArray[i] < rightArray[j]) {
                combinedArray[k++] = leftArray[i++];
            } else {
                combinedArray[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            combinedArray[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            combinedArray[k++] = rightArray[j++];
        }

        for ( i = 0 ; i < combined ; i++) {
            array[low + i] = combinedArray[i];
        }

    }
}