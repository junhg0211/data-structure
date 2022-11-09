package list.linkedlist.implementation;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;

        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        if (size == 0) {
            addFirst(input);
            return;
        }

        Node newNode = new Node(input);

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    Node node(int index) {
        Node x = head;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
            return;
        }

        Node temp1 = node(k-1);
        Node temp2 = temp1.next;
        Node newNode = new Node(input);

        temp1.next = newNode;
        newNode.next = temp2;

        if (newNode.next == null) {
            tail = newNode;
        }

        size++;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }

        Node temp = head;
        String str = "[";

        while (temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;

        return str + "]";
    }

    public Object removeFirst() {
        Node temp = head;
        head = temp.next;
        Object result = temp.data;
        temp = null;
        size--;
        return result;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }
}
