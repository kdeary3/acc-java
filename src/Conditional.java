import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in) ;

        System.out.println("Enter an integer: ");
        int check = userInput.nextInt() ;

        if (check <= 4 && check >= 1 )
            System.out.print("True.");
        else
            System.out.print("Error.") ;

        return ;
    }
}
