public class LambdaExpression {
    public static void main(String[] args) {

        // passing code to a function itself ( -> )
        ABC expression = () -> System.out.println("hello");
        ABC expression2 = () -> System.out.println(10);
        func2(expression);
        func2(expression2);
    }

    public static void func2(ABC expression) {
        expression.func1();
    }
}

// only 1 function can be in object
interface ABC {
    public void func1();
}
