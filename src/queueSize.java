import java.util.LinkedList;
import java.util.Queue;
public class queueSize {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add("Mazda");
        q1.add("BMW");
        q1.add("Alto");
        q1.add("Hybrid");
        q2.add(4500);
        q2.add(5);
        q2.add(90);
        q2.add(100);
        System.out.println("Queue 1 Size is :- "+q1.size());
        System.out.println("Queue 2 Size is :- "+q2.size());
    }
}
