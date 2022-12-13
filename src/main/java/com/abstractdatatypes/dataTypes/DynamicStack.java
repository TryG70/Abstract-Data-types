package com.abstractdatatypes.dataTypes;

import java.util.Arrays;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];

    int top = 0;

    public void push(int data) {

        if (size() == capacity) {
            expandCapacity();
        }

        stack[top] = data;
        top++;
    }

    public void expandCapacity() {
        capacity *= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, top);
        stack = newStack;
    }

    public void shrinkCapacity() {
        capacity = top;
        int[] newStack = new int[top];

        System.arraycopy(stack, 0, newStack, 0, top);
        stack = newStack;
    }


    public int pop() {

        int popped = 0;

        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            popped = stack[top];
            stack[top] = 0;
            System.out.println(Arrays.toString(stack));
            shrinkCapacity();
        }

        return popped;
    }

    public int peek() {

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void printAll() {
        for(int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
