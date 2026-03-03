public class RecursiveFibonacciAndFactorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(fib(10));
        System.out.println(recFib(10));
    }

    // recursion is define
    public static int fact(int n) {
        if (n == 1) return 1 ;
        return n * fact(n - 1) ;
    }

    public static int fib(int f) {
        int first = 1 ;
        int second = 1 ;
        int next ;
        for (int i = 0; i < f; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return first;
    }

    public static int recFib(int f){
        if (f == 0) return 1;
        if (f == 1) return 1;
        return recFib(f - 1) + recFib(f - 2);
    }
}