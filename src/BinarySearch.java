public class BinarySearch {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5,55,67,88,123,435,456,567,678,789,1234,2345,3546,4674,6678};

        int low = 0;
        int high = arr1.length-1;
        int value = 123 ;

        while(low <= high){
            int mid = (low+high)/2;
            if (arr1[mid] == value){
                System.out.println(arr1[mid] + " -- found");
                return ;
            }
            if(arr1[mid] > value) high = mid - 1;
            else low = mid + 1;
        }

        System.out.println("not found");
    }
}
