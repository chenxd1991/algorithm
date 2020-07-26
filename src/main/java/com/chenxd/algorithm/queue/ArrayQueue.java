package com.chenxd.algorithm.queue;

public class ArrayQueue {
    // 队列最大存储数据
    private int maxSize;
    // 队列头指针
    private int front;
    // 队列尾指针
    private int rear;
    // 队列数据存储
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[maxSize];
    }

    // 判读队列是否满数据
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // 判读队列是否为空
    public boolean isEmpty() {
        return front == rear;
    }

    public void addQueue(int n) {
        if (isFull()) {
            throw new RuntimeException("队列已满");
        }
        // 尾指针后移
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        // 头指针后移
        front++;
        return arr[front];
    }

}
