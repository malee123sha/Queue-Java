import java.util.LinkedList;
import java.util.Queue;
public class pollMethod2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4500);
        q.add(5);
        q.add(90);
        q.add(100);
        System.out.println("Queue       :- "+q);
        System.out.println("Poll Method :- "+q.poll() ); //remove "Head"
        System.out.println("Final Queue :- "+q);
    }
}
