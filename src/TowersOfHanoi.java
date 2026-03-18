class TowersOfHanoi {
    public static void main(String args[]){
        int n = 3;

        // A, B and C are names of rods
        towerOfHanoi(n, 'A', 'C', 'B');
        System.out.println( Math.pow(2,n) - 1 + " steps" );
    }

    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod){
        if (n == 0) return;

        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Disk " + n + " moved from " + fromRod + " to " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}
