package cau_truc_du_lieu_va_giai_thuat.MyLinkedListBasic;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public MyLinkedList<E> clone(){
        MyLinkedList<E> myLinkedListClone = new MyLinkedList<>(head);
        Node current=head;
        while(current!=null){
            myLinkedListClone.addLast((E) current.data);
            current=current.next;
        }
        return myLinkedListClone;
    }

    public void add(int index, E data) {
        if (index == 0) addFirst(data);
        else if (index >= numNodes) addLast(data);
        else {
            Node current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node temp = current.next;
            current.next = new Node(data);
            (current.next).next = temp;
            numNodes++;
        }
    }

    public void addFirst(E data) {
        Node current = head;
        head = new Node(data);
        head.next = current;
        numNodes++;
        if (tail == null) tail = head;
    }

    public void addLast(E data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {
        return numNodes;
    }

    public void remove(int index) {
        if (numNodes == 0) return;
        else {
            Node current = head;
            for (int i = 1; i < index - 1; i++)
                current = current.next;
            current.next = (current.next).next;
            numNodes--;
        }
    }

    public void clear() {
        Node current=head;
        while(current!=null){
            current=current.next;
            head=current;
        }
    }
}

