
public class GenericStack<T> {
    private T[] stackArray;
    private int top;
    public int capacity;

    public GenericStack(int size) {
        this.capacity = size;
        this.stackArray = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T value = stackArray[top];
        stackArray[top--] = null;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]).append(i < top ? ", " : "");
        }
        return sb.append("]").toString();
    }
}