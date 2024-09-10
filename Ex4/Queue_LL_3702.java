class Queue_LL_3702 {
    Node front, rear;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Queue_LL_3702() {
        this.front = this.rear = null;
    }
    // Enqueue operation
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }
    // Dequeue operation
    void dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        System.out.println("Dequeued element: " + temp.data);
    }
    // Print queue
    void printQueue() {
        Node currNode = front;
        System.out.print("Queue: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Queue_LL_3702 queue = new Queue_LL_3702();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}