package reviewstructures;

import java.util.Stack;

public class StackT {
    public static void main(String[] args) {
        // ! Synchronized. If you are using threads, use ArrayList
        Stack<String> customer = new Stack<>();
        customer.push("chip 1");
        customer.push("chip 2");
        customer.push("chip 3");

        System.out.println(customer.peek()); // Check last item added

        customer.pop(); //removes last item added
        System.out.println(customer);


    }
}
