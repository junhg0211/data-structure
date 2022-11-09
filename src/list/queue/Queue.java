package list.queue;

import list.linkedlist.LinkedList;

public class Queue {
    private LinkedList linkedList;

    public Queue() {
        linkedList = new LinkedList();
    }

    public void add(Object value) {
        linkedList.addLast(value);
    }

    public Object remove() {
        return linkedList.removeFirst();
    }

    public Object peek() {
        return linkedList.get(0);
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }
}
