package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.add(1, 15);
        numbers.addFirst(5);
        System.out.println(numbers);

        // System.out.println(numbers.removeFirst());
        System.out.println(numbers.removeFirst());
        System.out.println(numbers.remove(1));
        System.out.println(numbers.removeLast());
        System.out.println(numbers);
    }
}
