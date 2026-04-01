public class LinkedList {
    public static void main(String[] args) {

        Node node = new Node(10,null);
        LinkedList list = new LinkedList(node);
        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
        list.addLast(16);
        list.addLast(17);
        list.addLast(18);
        list.addLast(19);
        list.addLast(20);

        list.display();

    }

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node ptr = head;
        while (ptr.getNext() != null) {
            ptr = ptr.getNext();
        }
        ptr.setNext(node);

    }

    public void display() {
        if (head == null) return;

        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getNext();
        }
    }
}

class Node {
    private int data ;
    private Node next ;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
