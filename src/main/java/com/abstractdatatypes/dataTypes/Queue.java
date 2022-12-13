package com.abstractdatatypes.dataTypes;


public class Queue {

    int capacity = 2;

    int[] queue = new int[capacity];

    int size = 0;

    public void enqueue(int data) {

        if(size == capacity) {
            expandCapacity();
        }
        queue[size] = data;
        size++;
    }

    public void expandCapacity() {
        capacity *= 2;

        int[] newQueue = new int[capacity];
        System.arraycopy(queue, 0, newQueue, 0, size);
        queue = newQueue;

    }

    public int dequeue() {
        int data = 0;

        if(isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            data = queue[0];

            for(int i = 0; i < size-1; i++) {
                queue[i] = queue[i + 1];
            }
            queue[size-1] = 0;
            size--;
            shrinkCapacity();
        }
        return data;
    }

    public void shrinkCapacity() {
        capacity = size;

        int[] newQueue = new int[capacity];

        System.arraycopy(queue, 0, newQueue, 0, size);
        queue = newQueue;
    }

    public int size() {
        return size;
    }

    public void printAll() {
        for(int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public boolean isEmpty() {
        return size <= 0;
    }
}
