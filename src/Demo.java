import java.util.Scanner;
public class Demo {

    public static void demo() {
        // initialize
        Scanner userInput = new Scanner(System.in);
        String studentName;
        double studentGPA ;

        // receive input
        Address address = new Address("1909", "Alexander Ave","Austin","TX","78722") ;
        Student stu1 = new Student("Mike", 3.8, address) ;

        System.out.println(stu1.toString());

    }
}
