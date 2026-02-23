import java.util.Scanner;

public class Menu {
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int menuPress ;

        do {
            displayMenu() ;
            menuPress = userInput.nextInt();
            switch(menuPress) {
                case 1: addTwoNumbers(); break;
                case 2: subtractTwoNumbers(); break;
                case 3: display(); break;
                case 4:
                    System.out.println("Quitting...");
                    return ;
                default: System.out.println("Invalid input. Enter a number 1, 2, 3 or 4.");
            }
        } while (true) ;
    }


    public static void displayMenu() {
        System.out.print("Menu:\n1- add\n2- subtract\n3- display\n4- quit\n");
    }

    public static void addTwoNumbers() {
        System.out.println("You chose Add.\nInput First Number: ");
        int x = userInput.nextInt();
        System.out.println("Input Second Number: ");
        int y = userInput.nextInt();
        int sum = x + y;
        System.out.println("The sum is: " + sum);
    }

    public static void subtractTwoNumbers() {
        System.out.println("You chose Subtract.\nInput First Number: ");
        int x = userInput.nextInt();
        System.out.println("Input Second Number: ");
        int y = userInput.nextInt();
        int sum = x - y;
        System.out.println("The sum is: " + sum);
    }

    public static void display() {
        System.out.println("You chose Display.\nInput a message: ");
        String message = userInput.nextLine();
        System.out.println(message);
    }
}