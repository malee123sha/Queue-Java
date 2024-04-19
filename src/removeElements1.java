import java.util.LinkedList;
import java.util.Queue;
public class removeElements1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Mazda");
        q.add("BMW");
        q.add("Alto");
        q.add("Hybrid");
        System.out.println("Before Removing :- "+q);
        q.remove("BMW");
        System.out.println("After Removing  :- "+q);
    }
}
