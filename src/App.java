import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        //testingStack();
        testingQueue();
    }

    public static void testingStack() {
        // LIFO DATA STRUCTURE
        Stack<String> stack = new Stack<String>();
        // System.out.println(stack.empty());
        stack.push("One piece");
        stack.push("Hajimme no Ippo");
        stack.push("Naruto");
        stack.push("Haaykyuu");
        String favAnime = stack.pop();
        System.out.println(stack.search("Naruto"));
        System.out.println(favAnime);
        // System.out.println(stack.empty());
        System.out.println(stack);
    }

    public static void testingQueue() {
         // FIFO DATA STRUCTURE
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");            
        System.out.println(queue);
        // DEQUEUE
        queue.poll();
        queue.poll();
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // System.out.println(queue.contains("Karen"));
        System.out.println(queue.peek());
    }
}
