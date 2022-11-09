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
