import java.util.Queue;
import java.util.LinkedList;

public class queues {
    public static void main(String[] args) {
        // Queue = Fifo data structure. First in first out ( ex. A line of people)
        // a collection designed for holding elements prior to processing Linear data structure

        // add = enqueue, offer() will add a head
        // remove = dequeue, poll() will remove from the tail

        Queue<String> queue = new LinkedList<String>(); // you cant directly use queue because it is a interface

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harrold");

        queue.poll(); // removes the first element 

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harrold"));

        System.out.println(queue);
        System.out.println(queue.peek());


        // Where are queues usefull ?

        // 1.Keyboard buffer (letters should appear on the screen in order they're pressed)
        // 2. printer queue ( print jobs should be completed in order)
        // 3. Used in linkedlists, PriorityQueues, Breadth first search
    }
}
