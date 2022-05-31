package com.omar;

import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void reverse(Queue<Integer> queue) {
        java.util.Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
