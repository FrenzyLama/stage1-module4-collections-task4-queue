package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Add 2 cards from first queue to deque
        arrayDeque.add(firstQueue.poll());
        arrayDeque.add(firstQueue.poll());

        // Add 2 cards from second queue to deque
        arrayDeque.add(secondQueue.poll());
        arrayDeque.add(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) {
                firstQueue.add(arrayDeque.poll());
                arrayDeque.add(firstQueue.poll());
                arrayDeque.add(firstQueue.poll());
            }

            if (!secondQueue.isEmpty()) {
                secondQueue.add(arrayDeque.poll());
                arrayDeque.add(secondQueue.poll());
                arrayDeque.add(secondQueue.poll());
            }
        }
        System.out.println(arrayDeque);
        return arrayDeque;
    }
}
