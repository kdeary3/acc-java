public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {2, 10, 15, 17, 21} ;
        int[] arr2 = {3, 6, 18, 19} ;
        int[] arr3 = new int[arr1.length + arr2.length] ;

        int arr1Index = 0 ;
        int arr2Index = 0 ;
        int arr3Index = 0 ;

        while (arr1Index <= arr1.length - 1 && arr2Index <= arr2.length - 1 ) {
            if (arr1[arr1Index] < arr2[arr2Index])
                arr3[arr3Index++] = arr1[arr1Index++] ;
            else
                arr3[arr3Index++] = arr2[arr2Index++] ;
        }

        while (arr1Index <= arr1.length - 1)
            arr3[arr3Index++] = arr1[arr1Index++] ;

        while (arr2Index <= arr2.length - 1)
            arr3[arr3Index++] = arr2[arr2Index++] ;

        /*
        for (int i = 0; i < arr3.length; i++) {
            if (arr1[arr1Index] > arr2[arr2Index]) {
                arr3[i] = arr2[arr2Index] ;
                if (arr2Index < arr2.length - 1) arr2Index++ ;
                if (arr2Index == arr2.length) arr2Index = 0 ;
            }
            else {
                arr3[i] = arr1[arr1Index] ;
                if (arr1Index < arr1.length - 1) arr1Index++ ;
                if (arr1Index == arr1.length) arr1Index = 0 ;
            }
        }
        */
        for (int num : arr3) {
            System.out.println(num) ;
        }
    }
}