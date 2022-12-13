package com.abstractdatatypes.dataTypes;

import com.abstractdatatypes.node.Node;

public class LinkedList {

    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {

            Node n = head;

            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;

        head = node;
    }

    public void insertAtAny(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for(int i = 1; i < index; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index) {

        if (index == 0) {
            head = head.next;
        } else {

            Node n = head;

            for(int i = 1; i < index; i++) {
                n = n.next;
            }
            Node n1 = n.next;
            n.next = n1.next;
//            n.next = n.next.next;

        }
    }

    public void printAll() {
        Node node = head;

        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
