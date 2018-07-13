package MyStack_225;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> queue2 = new LinkedList<>();
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue2.add(queue.poll());
        }
        int result = queue.poll();
        queue = queue2;
        return result;
    }

    /** Get the top element. */
    public int top() {
        Queue<Integer> queue2 = new LinkedList<>();
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue2.add(queue.poll());
        }
        int result = queue.poll();
        queue2.add(result);
        queue = queue2;
        return result;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();

        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        result.add(String.valueOf(obj.pop()));
        result.add(String.valueOf(obj.pop()));
        result.add(String.valueOf(obj.pop()));
        result.add(String.valueOf(obj.empty()));

        System.out.println(String.format(result.toString()));
    }
}
