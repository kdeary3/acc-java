public class QueueArray {

    public static void main(String[] args){
        QueueArray queue = new QueueArray(10);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.display();
        int dequeued = queue.dequeue();
        System.out.println("Dequeued: " + dequeued);
        queue.display();

        queue.enqueue(10);
        queue.display();
    }

    private int[] queue ;
    private int size ;
    private int capacity ;
    private int front ;

    public QueueArray(int capacity){
        size = 0 ;
        front = 0 ;
        this.capacity = capacity ;
        queue = new int[capacity];
    }

    public void enqueue(int data){
        if (size == capacity){
            System.out.println("Queue is full") ;
            return;
        }

        int location = (front + size) % capacity ;
        queue[location] = data ;
        size++;
    }

    public int dequeue(){
        if (size == 0){
            System.out.println("Queue is empty") ;
            return -1 ;
        }

        int data = queue[front] ;
        front = (front + 1) % capacity ;
        size--;
        return data;
    }

    public int peek(){
        if (size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front] ;
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

    public boolean isFull(){
        return size == capacity ;
    }

    public void display(){
        for (int i = 0; i < size; i++){
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

}
