package reviewstructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueT {
    public static void main(String[] args) {
        // ! Synchronized. If you are using threads, use ArrayList
        Queue<String> customer = new LinkedList<>();
        customer.add("chip 1");
        customer.add("chip 2");
        customer.add("chip 3");

        System.out.println(customer);
        System.out.println(customer.peek()); // Check the item that is about to leave

        customer.poll(); //removes the item that is about to leave
        System.out.println(customer);


    }
}
