public class GenericLinearSearch {

    public static void main(String[] args) {

        func1(10, 20.5);
        func1("hello", 2);

        Employee2[] employee = {new Employee2(10, 10.0), new Employee2(7, 7.7), new Employee2(2,13.2)};
        Employee2 match = new Employee2(10, 10.0);
        boolean result = linearSearch(employee, match);
        System.out.println(result);

    }

    public static <T, K> void func1(T i, K j) {
        System.out.print(i + " " + j + "\n");
    }

    public static <T extends Comparable<T>> boolean linearSearch(T[] arr, T match) {
        for (T item : arr) {
            if (item.compareTo(match) == 0) return true;
        }
        return false;
    }

}