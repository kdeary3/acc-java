public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 67899876 ;
        int check = number ;
        int newNumber = 0;

        while (number > 0) {
            int remainder = number % 10 ;
            number = number / 10 ;
            newNumber = newNumber * 10 + remainder ;
        }

        if (newNumber == check)
            System.out.println("Palindrome: " + check + " = " + newNumber);

    }
}