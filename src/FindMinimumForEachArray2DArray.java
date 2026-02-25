// extend the activity we just did
// by creating a class called employee
// that has age and salary
// then apply the same logic but using objects vs. integers
public class FindMinimumForEachArray2DArray {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 3, 4}, {10, 20, 40, 2}, {5,4,6}, {43,56,43}, {33,55,45}};
        int[] arr2 = new int[arr1.length] ;

        for (int i = 0; i < arr1.length; i++) {
            int low = arr1[i][0] ;
            for (int j = 1; j < arr1[i].length; j++) {
                if(arr1[i][j] < low) low = arr1[i][j];
            }
            arr2[i] = low;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}