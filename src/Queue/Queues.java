package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        /*
            Queue = FIFO data structure
                    Example - Store line
                    A collection designed for holding elements prior to processing
                    Linear data structure

                    add = enqueue, offer()
                    remove = dequeue, poll()
                    look = peak()
         */

        Queue<String> queue= new LinkedList<>(); // queue is an interface, so we need a calls that implements queue

        queue.offer("Xiao");
        queue.offer("Kazuha");
        queue.offer("Sucrose");
        queue.offer("Sayu");
        queue.offer("Jean");
        queue.offer("Venti");

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Xiao"));

        // *************************output****************************
        // [Xiao, Kazuha, Sucrose, Sayu, Jean, Venti]
        // false
        // 6
        // true
        //
        // Process finished with exit code 0
        // ***********************************************************

    }
}
