package Stack;

import java.util.Stack;

public class program2 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("james");
        stack.push("peter");
        stack.push("albert");

        System.out.println(stack);

        System.out.println("Poped out element: " +stack.pop());

        System.out.println(stack);
        System.out.println("Topmost element: " +stack.peek());
    }
}
