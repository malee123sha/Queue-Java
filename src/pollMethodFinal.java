import java.util.LinkedList;
import java.util.Queue;
public class pollMethodFinal {
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
        System.out.println("Poll Method   :- "+q1.poll());
        System.out.println("Final Queue 1 :- "+q1);
        System.out.println("Poll Method   :- "+q2.poll());
        System.out.println("Final Queue 2 :- "+q2);
    }
}
