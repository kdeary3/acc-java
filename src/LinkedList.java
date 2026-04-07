public class LinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        int[] array = {11, 4, 18, 7, 2, 15, 1, 9, 20, 13, 6, 17, 3, 10, 8, 19, 5, 14, 12, 16};
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        list.removeFirst(); // removes 1
        list.removeLast(); // removes 20
        list.remove(14); // removes 14
        list.display();
        System.out.println(list.search(8));

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

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.getNext();
    }

    public void removeLast() {
        if (head == null) return;
        if (head.getNext() == null) return;

        Node ptr = head;
        while (ptr.getNext().getNext() != null) {
            ptr = ptr.getNext();
        }
        ptr.setNext(null) ;
    }

    public void remove(int data) {
        if (head == null) return;

        if (head.getData() == data) {
            head = head.getNext();
            return;
        }

        Node ptr = head;
        while (ptr.getNext() != null) {
            if (ptr.getNext().getData() == data) {
                ptr.setNext(ptr.getNext().getNext());
                return;
            }
            ptr = ptr.getNext();
        }
    }

    public boolean search(int value) {
        if (head == null) return false;

        Node ptr = head;
        while (ptr != null) {
            if (ptr.getData() == value) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        // if head is empty or new value is less than current head
        if (head == null) {
            head = newNode;
            return;
        }

        Node ptr = head;
        Node prevPtr = null;

        while ( (ptr.getData() < data) && (ptr.getNext() != null) ) {
            prevPtr = ptr;
            ptr = ptr.getNext();
        }

        if (ptr.getData() > data) {
            if (prevPtr == null) {
                head = newNode;
                newNode.setNext(ptr);
                return;
            }
            prevPtr.setNext(newNode);
            newNode.setNext(ptr);
            return;
        }

        if (ptr.getNext() == null) {
            ptr.setNext(newNode);
            return;
        }

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