public class MergeSort {
    public static void main(String[] args) {

        int[] x = {3, 10, 5,4,20,17,14,12};
        mergeSort(x,0,x.length-1);

        for (int i : x) {
            System.out.println(i);
        }
    }


    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high)
            return ;

        int mid = low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high){

        int size1 = mid-low+1 ;
        int size2 = high - mid ;
        int size3 = size1 + size2;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size3];

        for(int i=0 ;i<size1;i++)
            arr1[i] = arr[low+i];

        for(int i=0; i<size2;i++)
            arr2[i]=arr[mid+i+1];
        int x = 0;


        int i=0;
        int j=0;
        int k=0;
        while((i<arr1.length)&&(j<arr2.length))
            if(arr1[i]< arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++] ;

        while(i<arr1.length)
            arr3[k++] = arr1[i++];

        while(j<arr2.length)
            arr3[k++] = arr2[j++] ;


        for(i=0 ; i<size3;i++)
            arr[low+i] = arr3[i];

    }
}