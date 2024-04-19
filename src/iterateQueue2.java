import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class iterateQueue2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4500);
        q.add(5);
        q.add(90);
        q.add(100);
        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"  ");
        }
    }
}
