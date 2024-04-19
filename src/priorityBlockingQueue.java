import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
public class priorityBlockingQueue {
       public static void main(String[] args) {
           Queue<Integer> pbq = new PriorityBlockingQueue<>();
            //ADD ELEMENTS
           pbq.add(10000);
           pbq.add(500);
           pbq.add(2);
           pbq.add(2000);
           pbq.add(65);
            //TOP ELEMENT
           System.out.println("Top Element :- "+pbq.peek());
            //REMOVE TOP ELEMENT
           System.out.println("Poll Element:- "+pbq.poll());
           System.out.println("Queue       :- "+pbq);
    }
}
