import java.util.LinkedList;
import java.util.Queue;
public class Enqueue {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.offer("Mazda");
        q1.offer("BMW");
        q1.offer("Alto");
        q1.offer("Hybrid");
        q2.offer(4500);
        q2.offer(5);
        q2.offer(90);
        q2.offer(100);
        System.out.println("Enqueue Queue 1 :- "+q1);
        System.out.println("..................................");
        System.out.println("Enqueue Queue 2 :- "+q2);
    }
}
