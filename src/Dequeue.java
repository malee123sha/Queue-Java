import java.util.LinkedList;
import java.util.Queue;
public class Dequeue {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        //offer-data insert (enqueue concept)
        q1.offer("Mazda");
        q1.offer("BMW");
        q1.offer("Alto");
        q1.offer("Hybrid");
        q2.offer(4500);
        q2.offer(5);
        q2.offer(90);
        q2.offer(100);
        System.out.println("Enqueue Queue 1 :- "+q1);
        //poll-data remove the head (dequeue concept)
        System.out.println("Dequeue Queue 1 :- "+q1.poll());
        System.out.println("After Dequeue :- "+q1);
        //remove-data remove
        q1.remove("BMW");
        System.out.println("Updated Queue 1 :- "+q1);
        System.out.println("......................................");
        System.out.println("Enqueue Queue 2 :- "+q2);
        //poll-data remove the head (dequeue concept)
        System.out.println("Dequeue Queue 2 :- "+q2.poll());
        System.out.println("After Dequeue :- "+q2);
        //remove-data remove
        q2.remove(5);
        System.out.println("Updated Queue 2 :- "+q2);
    }
}
