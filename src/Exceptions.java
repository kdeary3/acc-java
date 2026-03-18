public class Exceptions {

    public static void main(String[] args) {

        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[3]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Chance to do cleanup");
        }

        System.out.println("Still in function");

        try {
            int result = 10 / 0;
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Math error or array error occurred.");
        }

    }

}
