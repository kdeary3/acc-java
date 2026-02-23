import java.util.Scanner;

public class NumberBetween1and4 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int number ;

        do { // do at least once
            System.out.print("Enter a number between 1 and 4: ") ;
            number = userInput.nextInt() ;
        } while ( (1 > number) || ( number > 4) ) ; // exit criteria
        
    }
}
