public class RecursiveAddDigits {
    public static void main(String[] args) {

        System.out.println(recAddDigits(1345));
        System.out.println(recPrinting0toN(8));

    }

    public static int recAddDigits(int n) {
        if (n == 1) return 1;
        return n % 10 + recAddDigits(n / 10);
    }

    public static int recPrinting0toN(int n) {
        if (n == 0) return 0;
        System.out.println(n);
        return recPrinting0toN(n - 1);
    }

}