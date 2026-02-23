import java.util.Scanner;

public class DoWhileMenuFinal {
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            displayMenu();
            int menuPress = userInput.nextInt() ;
            switch(menuPress) {
                case 1:
                    System.out.println("You chose \"Calculate Average\"");
                    System.out.print("Enter how many numbers to average: ");
                    int denominator = userInput.nextInt();
                    calcAverage(denominator);
                    break;
                case 2:
                    int smallestNumber = calcMinimum() ;
                    System.out.println("The smallest number is: " + smallestNumber);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return ;
                default:
                    System.out.println("Invalid input. Enter a number 1, 2 or 3.");
            }
        } while (true) ;
    }
    public static void displayMenu() {
        System.out.println("1 - Calculate Average");
        System.out.println("2 - Calculate Minimum");
        System.out.println("3 - Exit");
    }
    public static void calcAverage(int denominator) {
        if (denominator < 1) System.out.println("Invalid input. Enter a number greater than 0.");
        else {
            int numerator = 0 ;
            for (int i = 0; i < denominator; i++) {
                System.out.print("Enter a number: ");
                numerator += userInput.nextInt();
            }
            System.out.println("The average is: " + (numerator / denominator));
        }
    }
    public static int calcMinimum() {
        System.out.println("You chose \"Calculate Minimum\"");
        System.out.print("Enter the first number: ");
        int smallest = userInput.nextInt();
        int next ;
        while (true) {
            System.out.print("Enter a number (-99 to exit): ");
            next = userInput.nextInt();
            if (next == -99) break;
            if (smallest > next) smallest = next;
        }
        return smallest ;
    }
}