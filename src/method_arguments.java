public class method_arguments {
    public static void main(String[] args) {

        display("This is a message");
        display("This is also a message.");

    }

    // access specifiers:
    // public (99%) - anyone can see this function
    // private - only visible within the class it's defined in

    // return type:
    // void - execute and return nothing
    // or
    // int, string, double, etc...
    // return x ;

    public static void display(String message) { // display is a method. should be a verb/action word. i.e. enroll, submit, attend
        System.out.println(message) ;
    }

}