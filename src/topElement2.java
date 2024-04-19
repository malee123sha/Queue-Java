import java.util.LinkedList;
import java.util.Queue;
public class topElement2 {
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
        System.out.println("Queue 1 is :- "+q1);
        System.out.println("Queue 1's Top Element is :- "+q1.peek());
        System.out.println("Queue 2 is :- "+q2);
        System.out.println("Queue 2's Top Element is :- "+q2.peek());
    }
}
