import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String expression = "([ a + {b * c} ] * d)";
        boolean idk = isExpression(expression);
        System.out.println(idk);

    }

    public static boolean isExpression(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                if (!match(stack.pop(), ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean match(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '[' && close == ']') return true;
        if (open == '{' && close == '}') return true;
        return false;
    }
}