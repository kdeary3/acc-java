public class GenericMergeSort {

    public static void main(String[] args) {

        Double[] arr = {1.0,20.0,3.0,4.0,15.0,9.0,7.0,8.0};

        mergeSort(arr,0,arr.length-1);

        for (Double i : arr)
            System.out.println(i);

    }

    public static <T extends Comparable<T>> void mergeArray(T[] arr, int left, int right, int mid){

        int n1 = mid - left + 1 ;
        int n2 = right - mid;

        T[] arr1 = (T[]) new Comparable[n1];
        T[] arr2 = (T[]) new Comparable[n2];

        System.arraycopy(arr, left, arr1, 0, n1);
        System.arraycopy(arr, mid +1, arr2, 0, n2);

        int i = 0 ;
        int j = 0 ;
        int k = left;

        while (i < n1 && j < n2) {
            if (arr1[i].compareTo(arr2[j]) < 0) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i<n1){
            arr[k++] = arr1[i++];
        }

        while (j<n2){
            arr[k++] = arr2[j++] ;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] arr, int l, int r){
        if (l >= r)
            return ;

        int m = l + (r-l)/2 ;

        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        mergeArray(arr,l,r,m);
    }

}