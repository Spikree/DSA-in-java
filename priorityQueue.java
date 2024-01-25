import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        // Priority queue = A fifo data structure that serves elements with
        // the highest priorities firt before elements with lower priority

        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // queue.offer(3.0);
        // queue.offer(2.5);
        // queue.offer(4.0);
        // queue.offer(1.5);
        // queue.offer(2.0);

        Queue<String> queue = new PriorityQueue<>(); // you can show it in reverse order by using collection.reverseOrder here as well

        queue.offer("B");
        queue.offer("c");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
