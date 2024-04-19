import java.util.LinkedList;
import java.util.Queue;
public class linkedListQueue {
     public static void main(String[] args) {
         Queue<Integer> l = new LinkedList<>();
            //ADD ELEMENTS
         l.add(10000);
         l.add(500);
         l.add(2);
         l.add(2000);
         l.add(65);
         System.out.println(l);
            //TOP ELEMENT
         System.out.println("Top Element :- "+l.peek());
            //REMOVE TOP ELEMENT
         System.out.println("Poll Element:- "+l.poll());
         System.out.println("Queue       :- "+l);
    }
}
