public class StackReverse {
    public static void main(String[] args) {
        GenericStack<Object> stack = new GenericStack<>(10);
        stack.push(1);
        stack.push("this is a second item");
        stack.push(3.14);
        stack.push("this is a fourth item");
        stack.push(true);

        System.out.println("OG: " + stack);
        stackReverse(stack);
        System.out.println("Reversed: " + stack);

        GenericStack<String> stack2 = new GenericStack<>(10);
        stack2.push("t");
        stack2.push("a");
        stack2.push("c");
        stack2.push("o");
        stack2.push("c");
        stack2.push("a");
        stack2.push("t");

        System.out.println("OG: " + stack2);
        stackReverse(stack);
        System.out.println("Reversed: " + stack2);

    }

    public static <T> void stackReverse(GenericStack<T> stack) {
        if (stack.isEmpty()) return;

        T top = stack.pop();
        stackReverse(stack);
        bottomInsert(stack, top);
    }

    private static <T> void bottomInsert(GenericStack<T> stack, T element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        T top = stack.pop();
        bottomInsert(stack, element);
        stack.push(top);
    }
}