import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
public class priorityBlockingQueue1 {
     public static void main(String[] args) {
         Queue<String> q1 = new PriorityBlockingQueue<>();
         Queue<Integer> q2 = new PriorityBlockingQueue<>();
         q1.add("Mazda");
         q1.add("BMW");
         q1.add("Alto");
         q1.add("Hybrid");
         q2.add(4500);
         q2.add(5);
         q2.add(90);
         q2.add(100);
         System.out.println(q1);
         System.out.println("Top Element :- "+q1.peek());
         System.out.println("Poll Element:- "+q1.poll());
         System.out.println("Queue 1 is  :- "+q1);
         System.out.println("....................................");
         System.out.println(q2);
         System.out.println("Top Element :- "+q2.peek());
         System.out.println("Poll Element:- "+q2.poll());
         System.out.println("Queue 2 is  :- "+q2);
    }
}
