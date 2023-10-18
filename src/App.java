import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        testingStack();
        //testingQueue();
        //testingPriorityQueue();
        //testingLinkedList();
        //testingDynamicArray();
    }

    public static void testingStack() {
        // LIFO DATA STRUCTURE
        Stack<String> stack = new Stack<String>();
        // System.out.println(stack.empty());
        stack.push("One piece");
        stack.push("Hajimme no Ippo");
        stack.push("Naruto");
        stack.push("Haaykyuu");
        stack.push("Yu yu Hakusho");
        String favAnime = stack.pop();
        System.out.println(stack.search("Naruto"));
        System.out.println(favAnime);
        // System.out.println(stack.empty());
        System.out.println(stack);
    }

    public static void testingQueue() {
         // FIFO DATA STRUCTURE
        Queue<String> queue = new LinkedList<String>();
        //ENQUEUE
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
        System.out.println(queue);
    }

    public static void testingPriorityQueue(){
        // FIFO DATA STRUCTURE
        Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer(3.0);
        priorityQueue.offer(6.0);
        priorityQueue.offer(2.3);
        priorityQueue.offer(11.10);

        System.out.println(priorityQueue);
    }

    public static void testingLinkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.indexOf(0);
        linkedList.addFirst("wow");
        linkedList.addLast("so awesome");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }

    public static void testingArrayList(){
        ArrayList<String> arrayList = new ArrayList<String>();
    }

    public static  void testingDynamicArray(){

        DynamicArray dynamicArray = new DynamicArray(12);
//        dynamicArray
        System.out.println(dynamicArray.capacity);
        
    }
}
