package com.coderx;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(3);
        queue.add("Shenal");
        queue.add("Pasan");
        queue.add("Pamudu");

        System.out.println(queue); // already sorted
//        queue.remove(); // first one going to be removed
//        System.out.println(queue);

       // System.out.println(queue.poll());
        queue.add("Vajith");
        queue.add("Ruchira");
        System.out.println(queue);
    }
}
