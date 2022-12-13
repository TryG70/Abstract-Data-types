package com.abstractdatatypes.dataTypes;

public class Stack {

    int[] stack = new int[5];

    int top = 0;

    public void push(int data) {

        if (top == 5) {
            System.out.println("Stack is full");
        }else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {

        int popped = 0;

        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            popped = stack[top];
            stack[top] = 0;
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
