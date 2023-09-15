package adt;

import java.util.ArrayList;
import java.util.List;

public class QueueADTImpl<T> implements QueueADT<T> {
    private int rear;
    private int capacity;
    private List<T> items;

    public QueueADTImpl(int capacity) {
        if (capacity <= 0) {
            throw new RuntimeException("Kich thuoc phai duong");
        }
        this.capacity = capacity;
        this.rear = -1;
        this.items = new ArrayList<>();
    }

    @Override
    public void enqueue(T t) {
        if (isFull()) {
            throw new RuntimeException("Hang doi da day!");
        }
        // Them vao cuoi
        items.add(t);
        rear++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Hang doi rong!");
        }
        T t = items.get(0);
        items.remove(0);
        rear--;
        return t;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        if (items.size() == capacity) return true;
        return false;
    }

    @Override
    public void display() {
        System.out.print("Queue:  ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(items.get(i) + "  ");
        }
        System.out.println();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public T front() {
        return items.get(0);
    }

    @Override
    public T rear() {
        return items.get(rear);
    }
}
