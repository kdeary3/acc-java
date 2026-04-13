public class StackReverseLoop {
    public static void main(String[] args) {
        GenericStack<Object> stack = new GenericStack<>(20);
        stack.push(1);
        stack.push("this is a second item");
        stack.push(3.14);
        stack.push("this is a fourth item");
        stack.push(true);
        stack.push(false);
        stack.push("t");
        stack.push("a");
        stack.push("c");
        stack.push("o");
        stack.push("c");
        stack.push("a");
        stack.push("t");
        stack.push("r");
        stack.push("a");
        stack.push("c");
        stack.push("e");
        stack.push("c");
        stack.push("a");
        stack.push("r");

        GenericStack<Object> stack2 = new GenericStack<>(stack.capacity);

        System.out.println("OG: " + stack);
        stackReverse(stack, stack2);
        System.out.println("Reversed: " + stack2);

    }

    public static <T> void stackReverse(GenericStack<T> stack, GenericStack<T> stack2) {
        for (int i = 0; i < stack.capacity; i++) {
            stack2.push(stack.pop());
        }
    }
}