package list.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
