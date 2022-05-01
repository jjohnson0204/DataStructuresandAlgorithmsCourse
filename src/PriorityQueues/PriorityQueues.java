package PriorityQueues;

import java.awt.*;
import java.util.*;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PriorityQueues {

    public static void main(String[] args) {

        /*
            Priority Queue = FIFO data structure that serves elements
                    with the highest priorities first
                    before elements with lower priority
         */

        Queue<String> queue= new PriorityQueue<>(); // queue is an interface, so we need a call that implements queue

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        reverseQueue(queue); // calling the reverseQueue method created
        // *************************output****************************
        //  A
        //  B
        //  C
        //  D
        //  F
        // ***********************************************************

    }
    // taught myself to reverse priority queue using stack

    private static Queue<String> reverseQueue(Queue<String> queue){
        int n=queue.size();

        Stack<String> stack=new Stack<>();
        Queue<String> newQueue = new LinkedBlockingQueue<String>();
        // remove all the elements from the queue and push them to stack
        for (int i=0;i<n;i++){
            String current=queue.poll();
            stack.push(current);
            System.out.println(current);
        }
        System.out.println("-----------------");
        // put them back
        for(int i=0;i<n;i++){
            String current=stack.pop();
            newQueue.add(current);
            System.out.println(current);
        }
        System.out.println("-----------------");
        // present reversed queue
        for(String i:newQueue) {
            System.out.print(i+"");
        }
        System.out.println();
        return newQueue;
    }

    // *************************output****************************
    // A
    // B
    // C
    // D
    // F
    // -----------------
    // F
    // D
    // C
    // B
    // A
    // -----------------
    // FDCBA
    // ***********************************************************
}
