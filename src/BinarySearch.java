public class BinarySearch {
    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5,55,67,88,123,435,456,567,678,789,1234,2345,3546,4674,6678};
        int match = 123 ;
        boolean result = binarySearch(arr1, match) ;
        System.out.println(result);

    }

    public static <T extends Comparable<T>> boolean binarySearch(T[] arr1, T match) {
        int low = 0;
        int high = arr1.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int comparison = arr1[mid].compareTo(match);
            if (comparison == 0) {
                System.out.println("Found: " + arr1[mid]);
                return true;
            } else if (comparison > 0) {
                // This means arr1[mid] is GREATER than match
                high = mid - 1;
            } else {
                // This means arr1[mid] is LESS than match
                low = mid + 1;
            }
        }

        System.out.println("Not found");
        return false;
    }
}
