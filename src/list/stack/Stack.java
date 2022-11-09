package list.stack;

import list.linkedlist.LinkedList;

public class Stack {
    private LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    public void push(Object input) {
        linkedList.addFirst(input);
    }

    public Object pop() {
        return linkedList.removeFirst();
    }

    public Object peek() {
        return linkedList.get(0);
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }
}
