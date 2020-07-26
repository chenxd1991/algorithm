package com.chenxd.algorithm.queue;

public class CircleArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.arr = new int[maxSize];
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void add(int num) {
        if (isFull()) {
            throw new RuntimeException("队里已满");
        }
        arr[rear] = num;
        rear = (rear + 1) % maxSize;
    }

    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int val = arr[front];
        front = (front + 1) % maxSize;
        return val;
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }
}
