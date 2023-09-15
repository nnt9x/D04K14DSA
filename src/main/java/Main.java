public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.display();
        System.out.println("Dequeue: "+queue.dequeue());
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.enqueue(10);
        queue.display();
    }
}
