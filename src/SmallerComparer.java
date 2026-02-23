import java.util.Scanner;

public class SmallerComparer {
    public static void main(String[] args) {
        System.out.print("Enter the number of numbers to compare: ");

        Scanner userInput = new Scanner(System.in) ;
        int count = userInput.nextInt() + 1;

        System.out.print("Enter number 1: ");
        int smallest = userInput.nextInt();

        for( int i = 2; i < count ; i++) {
            System.out.print("Enter number " + i + ": ");
            int next = userInput.nextInt();

            if (smallest > next) smallest = next ;
        }

        System.out.println("The smallest number is: " + smallest);

    }
}
