import java.util.Queue;

public class QueueList {

    public static void main(String[] args) {

        QueueList queue = new QueueList();

        Node head = new Node(1);
        Node node = new Node(2);
        Node rear = new Node(3);
        Node node4 = new Node(4);

        queue.enqueue(head);
        queue.display();
        queue.enqueue(node);
        queue.display();
        queue.enqueue(rear);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue(node4);
        queue.display();



    }

    private Node front;
    private Node rear ;

    public QueueList(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public QueueList() {
        front = null;
        rear = null;
    }
    public QueueList(Node front) {
        this.front = front;
    }
    public Node getFront() {
        return front;
    }
    public void setFront(Node front) {
        this.front = front;
    }
    public Node getRear() {
        return rear;
    }
    public void setRear(Node rear) {
        this.rear = rear;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return front == rear;
    }

    public void enqueue(Node node) {
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
    }

    public Node dequeue() {
        if (isEmpty()){
            return null;
        }
        else {
            Node temp = front;
            front = front.getNext();
            return temp;
        }
    }

    public int peek() {
        if (front == null){
            return -1;
        }
        else {
            return front.getData();
        }
    }

    public void display() {
        if (front == null) return;

        Node ptr = front;
        while (ptr != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getNext();
        }
        System.out.println("");
    }
}