import java.util.Stack;

public class PostfixCalculator {
    public static void main(String[] args) {
        String expression = "3 4 5 * +";
        String[] tokens = expression.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();

                switch (token) {
                    case "+": stack.push(firstOperand + secondOperand); break;
                    case "-": stack.push(firstOperand - secondOperand); break;
                    case "*": stack.push(firstOperand * secondOperand); break;
                    case "/": stack.push(firstOperand / secondOperand); break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        System.out.println("Result: " + stack.pop());
    }
}