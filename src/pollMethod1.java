import java.util.LinkedList;
import java.util.Queue;
public class pollMethod1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Mazda");
        q.add("BMW");
        q.add("Alto");
        q.add("Hybrid");
        System.out.println("Queue       :- "+q);
        System.out.println("Poll Method :- "+q.poll() ); //remove "Head"
        System.out.println("Final Queue :- "+q);
    }
}
