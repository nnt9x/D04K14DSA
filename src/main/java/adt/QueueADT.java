package adt;

public interface QueueADT<T> {
    void enqueue(T t);

    T dequeue();

    boolean isEmpty();

    boolean isFull();

    void display();

    int size();

    T front();

    T rear();

}
