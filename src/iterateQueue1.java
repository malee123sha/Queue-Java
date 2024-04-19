import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class iterateQueue1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Mazda");
        q.add("BMW");
        q.add("Alto");
        q.add("Hybrid");
        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"  ");
        }
    }
}
