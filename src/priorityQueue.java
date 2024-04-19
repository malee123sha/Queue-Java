import java.util.PriorityQueue;
import java.util.Queue;
public class priorityQueue {
    public static void main(String[] args) {
        Queue <Integer> pq = new PriorityQueue<Integer>();
        //ADD ELEMENTS
        pq.add(10000);
        pq.add(500);
        pq.add(2);
        pq.add(2000);
        pq.add(65);
        //TOP ELEMENT
        System.out.println("Top Element :- "+pq.peek());
        //REMOVE TOP ELEMENT
        System.out.println("Poll Element:- "+pq.poll());
        System.out.println("Queue       :- "+pq);
    }
}
