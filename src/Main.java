import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int number = 12;
        int[] combo = {2, 3, 5};
        int[][] arr = new int[combo.length][number + 1];

        for (int i = 0; i < combo.length; i++) {
            for (int j = 0; j < number + 1; j++) {
                if (j == 0) arr[i][j] = 1;
                if (j > combo[i]) arr[i][j] = arr[i-1][j] ;
                else {
                    if (j % combo[i] == 0) arr[i][j] = arr[i][combo[i]] ;
                }

                arr[i][j] = j;
            }
        }

        for (int i = 0; i < combo.length; i++) {
            for (int j = 0; j < number + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}