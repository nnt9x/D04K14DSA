public class Queue {
    // Sử dụng mảng để triển -> có hạn chế
    // Hàng đợi chứa số cơ bản
    private int front, rear;
    private int capacity; // Kich thuoc toi da
    private int items[];

    public Queue(int capacity) {
        this.capacity = capacity;
        this.rear = this.front = -1;
        this.items = new int[capacity];
    }

    public boolean isEmpty() {
        if (front == -1) return true;
        return false;
    }

    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) return true;
        return false;
    }

    public void enqueue(int x) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        rear = rear + 1;
        items[rear] = x;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int x = items[front]; // vi tri dau hang hien tai
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return x;
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue:");
        for (int i = front; i <= rear; i++) {
            System.out.print(items[i] + "  ");
        }
        System.out.println();
    }

}
