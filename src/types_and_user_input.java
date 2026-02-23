import java.util.Scanner;

public class types_and_user_input {
    public static void main(String[] args) {

        // Different types
        final int DAYS = 7 ;
        boolean rain = true ;
        char character = 'a' ;
        String myString = "This is a string" ; // String is a class, "\n" creates a new line
        System.out.println(DAYS + "," + rain + ", " + character + ", " + myString) ;

    // Prompt user
    System.out.println("Enter a integer, double and a string: ");

    // Receive input from user
    Scanner userInput = new Scanner(System.in) ;
    int inputInt = userInput.nextInt() ;
    double inputDouble = userInput.nextDouble(); userInput.next() ; // second userInput goes to next line.
    String inputString = userInput.nextLine() ;
    System.out.println(inputInt + ", " + inputDouble + ", " + inputString) ;

    }
}