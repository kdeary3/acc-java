import java.util.Scanner;

public class EmployeeAgeUsingArray {
    public static void main(String[] args) {

        // MY SOLUTION
        int[] employeeArray = new int[5] ;
        int index = 0 ;
        int menuChoice;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("Enter menu choice: ");
            menuChoice = userInput.nextInt();
            switch(menuChoice) {
                case 1:
                    char case1Choice = 'n' ;
                    do {
                        if (index == employeeArray.length) {
                            System.out.println("Too many employees.");
                            break ;
                        }
                        System.out.print("Enter employee age: ");
                        employeeArray[index] = userInput.nextInt();
                        index++;
                        System.out.print("Add another? (y or n): ");
                        case1Choice = userInput.next().charAt(0);
                        if (case1Choice != 'y' || case1Choice != 'n') {
                            System.out.println("Invalid entry. y or n.");
                            break;
                        }
                    } while (case1Choice == 'y') ;
                    break ;
                case 2:
                    if (index == 0) {
                        System.out.println("There is no employee entries.");
                        break ;
                    }
                    int accumulator = 0;
                    int j = 0 ;
                    for ( ; j < employeeArray.length; j++) {
                        accumulator += employeeArray[j];
                    }
                    System.out.println("The average age of employees is: " + accumulator / j);
                    break ;

                case 3:
                    System.out.print("Enter an age: ");
                    int age = userInput.nextInt();

                    for (int i = 0; i < employeeArray.length; i++){
                        if (employeeArray[i] >= age) System.out.println("Employee " + (i+1) + " is above " + age + ". The employee is "+ employeeArray[i]);
                    }

                    break ;
                case 4:
                    System.out.println("Exiting...");
                    return ;
            }
        } while (true) ;
    }

    // SECOND SOLUTION
    /*
    Scanner obj= new Scanner(System.in);

    System.out.println("What is the maximum size: ");
    int size = obj.nextInt();
    int count = 0 ;

    int[] empAge = new int[size];
    int choice = 0;

        do{
        displayMenu();
        System.out.print("Enter your choice: ");
        choice = obj.nextInt();

        switch(choice){
            case 1: count = add(empAge,count); break;
            case 2: calcAverage(empAge,count); break;
            case 3: execReport(empAge,count);break;
            case 4: return ;
            default: System.out.print("Invalid input...");
        }

    }while(choice != 4);

}

public static void displayMenu(){
    System.out.println("1- add");
    System.out.println("2- Average age");
    System.out.println("3- Report above age");
    System.out.println("4: Quit");
}

public static int add(int[] age, int count){
    if(count == age.length){
        System.out.println("You reached the maximum capacity. you can't add..");
        return count;
    }

    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the age: ");
    age[count++]=obj.nextInt();
    return count ;

}

public static void calcAverage(int[] age, int count){
    double total=0;
    for(int i=0;i<count;i++)
        total = total + age[i];

    System.out.println("Average is: " + total/count);
}


public static void execReport(int[] age, int count){
    Scanner obj = new Scanner(System.in);
    System.out.print("Which age you want to consider: ");
    int threshold = obj.nextInt();

    for(int i=0; i<count;i++)
        if(age[i] >= threshold)
            System.out.println(age[i]);

     */
}