public class CoinChangeProblem {
    public static void main(String[] args) {

        int[] coins = {2, 3, 5};
        int number = 12;
        int[][] table = new int[coins.length][number + 1];

        for (int i = 0; i < coins.length; i++) {
            table[i][0] = 1;
        }

        for (int i = 1; i < number + 1; i++) {
            if (i % coins[0] == 0)
                table[0][i] = 1 ;
        }

        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j < number + 1; j++) {
                if (j < coins[i])
                    table[i][j] = table[i - 1][j];
                else
                    table[i][j] = table[i-1][j] + table[i][j-coins[i]];
            }
        }

        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < number + 1; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(table[coins.length - 1][number]);
    }
}