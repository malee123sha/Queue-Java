import java.util.LinkedList;
import java.util.Queue;
public class topElement1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Mazda");
        q.add("BMW");
        q.add("Alto");
        q.add("Hybrid");
        System.out.println(q);
        System.out.println("Top Element is :- "+q.peek());
    }
}
